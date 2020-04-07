package com.zhangshun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //服务端的启动类 接收注册信息
public class Eureka_8002 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka_8002.class, args);
    }
}
