package com.ddal.eurekaservercluster01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCluster01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCluster01Application.class, args);
    }

}
