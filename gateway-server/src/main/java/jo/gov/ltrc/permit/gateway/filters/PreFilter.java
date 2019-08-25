package jo.gov.ltrc.permit.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.http.HttpServletRequestWrapper;
import jo.gov.ltrc.permit.gateway.util.JwtUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

        try {
            if (request.getRequestURL().toString().endsWith("/login")) {
                return null;
            }

            String username = JwtUtil.getSubject(request, jwtTokenCookieName, signingKey);
            if (username == null) {
                   response.sendRedirect("/login");
            }
            /*else {
                request.setAttribute("username", username);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
//
//    final class MutableHttpServletRequest extends HttpServletRequestWrapper {
//        // holds custom header and value mapping
//        private final Map<String, String> customHeaders;
//
//        public MutableHttpServletRequest(HttpServletRequest request){
//            super(request);
//            this.customHeaders = new HashMap<String, String>();
//        }
//
//        public void putHeader(String name, String value){
//            this.customHeaders.put(name, value);
//        }
//
//        public String getHeader(String name) {
//            // check the custom headers first
//            String headerValue = customHeaders.get(name);
//
//            if (headerValue != null){
//                return headerValue;
//            }
//            // else return from into the original wrapped object
//            return ((HttpServletRequest) getRequest()).getHeader(name);
//        }
//
//        public Enumeration<String> getHeaderNames() {
//            // create a set of the custom header names
//            Set<String> set = new HashSet<String>(customHeaders.keySet());
//
//            // now add the headers from the wrapped request object
//            @SuppressWarnings("unchecked")
//            Enumeration<String> e = ((HttpServletRequest) getRequest()).getHeaderNames();
//            while (e.hasMoreElements()) {
//                // add the names of the request headers into the list
//                String n = e.nextElement();
//                set.add(n);
//            }
//
//            // create an enumeration from the set and return
//            return Collections.enumeration(set);
//        }
//    }
}