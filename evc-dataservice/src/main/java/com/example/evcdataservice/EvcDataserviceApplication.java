package com.example.evcdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EvcDataserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvcDataserviceApplication.class, args);
    }

}
