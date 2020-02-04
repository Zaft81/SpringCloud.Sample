package com.ddal.shoporder.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ryan
 * @version 1.0
 * @date 1/30/2020
 */
@Configuration
public class OrderConfig {

    @Bean
    @LoadBalanced//注解Ribbon 负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
