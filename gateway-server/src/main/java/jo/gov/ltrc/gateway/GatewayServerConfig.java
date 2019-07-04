package jo.gov.ltrc.gateway;

import jo.gov.ltrc.gateway.filters.ErrorFilter;
import jo.gov.ltrc.gateway.filters.PostFilter;
import jo.gov.ltrc.gateway.filters.PreFilter;
import jo.gov.ltrc.gateway.filters.RouteFilter;
import jo.gov.ltrc.gateway.util.JwtFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class GatewayServerConfig {

//    @Value("${services.auth}")
//    private String authService;

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

//    @Bean
//    public FilterRegistrationBean jwtFilter() {
//        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new JwtFilter());
//        registrationBean.setInitParameters(Collections.singletonMap("services.auth", authService));
//        registrationBean.addUrlPatterns("/**");
//
//        return registrationBean;
//    }
}
