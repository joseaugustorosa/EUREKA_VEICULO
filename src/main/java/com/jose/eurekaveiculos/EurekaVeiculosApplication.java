package com.jose.eurekaveiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaVeiculosApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaVeiculosApplication.class, args);
    }

}
