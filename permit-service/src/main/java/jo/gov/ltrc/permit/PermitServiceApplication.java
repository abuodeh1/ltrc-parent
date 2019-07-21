package jo.gov.ltrc.permit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class PermitServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PermitServiceApplication.class, args);
    }

}
