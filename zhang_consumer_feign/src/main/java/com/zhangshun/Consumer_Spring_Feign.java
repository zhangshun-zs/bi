package com.zhangshun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Consumer_Spring_Feign {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_Spring_Feign.class,args);
    }
}
