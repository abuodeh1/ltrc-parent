package jo.gov.ltrc.permit.authserver.confg;

import jo.gov.ltrc.permit.authserver.repositories.UserDBService;
import jo.gov.ltrc.permit.authserver.util.CookieUtil;
import jo.gov.ltrc.permit.authserver.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.ldap.authentication.ad.ActiveDirectoryLdapAuthenticationProvider;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
public class MultipleAuthProvidersSecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${authentication.active-directory.enabled: false}")
    private boolean isADAuthEnabled;

    @Value("${authentication.database.enabled: false}")
    private boolean isDBAuthEnabled;

    @Value("${ldap.domain}")
    private String domain;

    @Value("${ldap.urls}")
    private String url;

    @Value("${ldap.base.dn}")
    private String rootDn;

//    @Value("${cookie.security.domain}")
//    private String cookieDomain;

    private static final String jwtTokenCookieName = "JWT-TOKEN";

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        ServiceInstance gatewayInstance = discoveryClient.getInstances("gateway-server").get(0);

        http.authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
            .formLogin()
                //.loginPage("/login")
                .permitAll()
                .successHandler(myAuthenticationSuccessHandler())
            .and()
                .logout()
                .permitAll()
                .addLogoutHandler((httpServletRequest, httpServletResponse, authentication) -> {
                    CookieUtil.clear(httpServletResponse, jwtTokenCookieName, gatewayInstance.getHost());
                    JwtUtil.invalidateRelatedTokens(httpServletRequest);
                    try {
                        httpServletResponse.sendRedirect(gatewayInstance.getUri().toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .invalidateHttpSession(true);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
        authManagerBuilder.authenticationProvider(databaseAuthenticationProvider()).userDetailsService(userDetailsService());
        authManagerBuilder.authenticationProvider(activeDirectoryLdapAuthenticationProvider()).userDetailsService(userDetailsService());
    }

    @Bean
    public AuthenticationSuccessHandler myAuthenticationSuccessHandler() {
        return new CustomUrlAuthenticationSuccessHandler();
    }

    @Bean
    public AuthenticationManager authenticationManager() {

        List<AuthenticationProvider> providers = new ArrayList<>();
        providers.add(new AuthenticationProvider() {

            @Override
            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
                return null;
            }

            @Override
            public boolean supports(Class<?> aClass) {
                return false;
            }
        });

        if (isDBAuthEnabled)
            providers.add(databaseAuthenticationProvider());

        if (isADAuthEnabled)
            providers.add(activeDirectoryLdapAuthenticationProvider());

        return new ProviderManager(providers);
    }

    @Bean
    public AuthenticationProvider activeDirectoryLdapAuthenticationProvider() {
        ActiveDirectoryLdapAuthenticationProvider provider = new ActiveDirectoryLdapAuthenticationProvider(domain, url, rootDn);
        provider.setConvertSubErrorCodesToExceptions(true);
        provider.setUseAuthenticationRequestCredentials(true);

        return provider;
    }

    @Bean
    public AuthenticationProvider databaseAuthenticationProvider() {
        return new AuthenticationProvider() {

            @Autowired
            private UserDBService userDBService;

            @Autowired
            private BCryptPasswordEncoder passwordEncoder;

            @Override
            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
                String username = authentication.getName();
                String password = authentication.getCredentials().toString();

                UserDetails userDetails = userDBService.loadUserByUsername(username);
                if (!userDetails.getPassword().equals(password)) {
                    throw new BadCredentialsException("Database authentication failed");
                }

                return new UsernamePasswordAuthenticationToken(username, password, Collections.emptyList());
            }

            @Override
            public boolean supports(Class<?> authentication) {
                return authentication.equals(UsernamePasswordAuthenticationToken.class);
            }
        };
    }

}
