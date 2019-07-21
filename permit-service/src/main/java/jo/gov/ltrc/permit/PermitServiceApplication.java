package jo.gov.ltrc.permit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PermitServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PermitServiceApplication.class, args);
    }

}
