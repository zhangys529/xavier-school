package com.x.police;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.x.kurt")
@ComponentScan({
    "com.x.police",
    "com.x.kurt"
})
public class PoliceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoliceApplication.class, args);
    }

}
