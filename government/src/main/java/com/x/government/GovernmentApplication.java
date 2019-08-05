package com.x.government;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.x.kurt")
@ComponentScan({
    "com.x.government",
    "com.x.kurt"
})
public class GovernmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(GovernmentApplication.class, args);
    }

}
