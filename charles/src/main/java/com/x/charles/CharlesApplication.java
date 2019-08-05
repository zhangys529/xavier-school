package com.x.charles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CharlesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharlesApplication.class, args);
    }

}
