package jo.gov.ltrc.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import jo.gov.ltrc.gateway.util.JwtUtil;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PreFilter extends ZuulFilter {

    private static final String jwtTokenCookieName = "JWT-TOKEN";
    private static final String signingKey = "signingKey";

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response = ctx.getResponse();

        System.out.println(
                "Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());

        try {
            if (request.getRequestURL().toString().endsWith("/login")) {
                return null;
            }

            String username = JwtUtil.getSubject(request, jwtTokenCookieName, signingKey);
            if (username == null) {

//                request.setAttribute("redirect", request.getRequestURL().toString());
//                request.getRequestDispatcher("/login").forward(request, response);

                    response.sendRedirect("/login");

            } else {
                request.setAttribute("username", username);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}