package com.x.hank;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class HankApplication {

    public static void main(String[] args) {
        SpringApplication.run(HankApplication.class, args);
    }

}
