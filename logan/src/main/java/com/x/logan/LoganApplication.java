package com.x.logan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class LoganApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoganApplication.class, args);
    }

}
