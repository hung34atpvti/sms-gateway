package com.cmcg.nmhung.smsgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableEurekaClient
@FeignClient
public class SmsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsGatewayApplication.class, args);
    }

}
