package com.ddal.eurekaserversn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSnApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSnApplication.class, args);
    }

}
