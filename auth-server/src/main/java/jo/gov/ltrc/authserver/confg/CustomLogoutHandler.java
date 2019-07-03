package jo.gov.ltrc.authserver.confg;

import jo.gov.ltrc.authserver.outside.CookieUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomLogoutHandler implements LogoutHandler {

    private static final String jwtTokenCookieName = "JWT-TOKEN";

    @Override
    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) {

        CookieUtil.clear(httpServletResponse, jwtTokenCookieName);
//        return "redirect:/";

    }
}
