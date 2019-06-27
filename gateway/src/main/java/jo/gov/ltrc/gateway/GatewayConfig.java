package jo.gov.ltrc.gateway;

import jo.gov.ltrc.gateway.filters.ErrorFilter;
import jo.gov.ltrc.gateway.filters.PostFilter;
import jo.gov.ltrc.gateway.filters.PreFilter;
import jo.gov.ltrc.gateway.filters.RouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

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
}
