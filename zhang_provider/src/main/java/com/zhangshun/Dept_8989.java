package com.zhangshun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//启动类
@SpringBootApplication
@EnableEurekaClient  //服务启动后 自动注册到eureka中  类似于zookeeper
@EnableDiscoveryClient
public class Dept_8989 {
    public static void main(String[] args) {
        SpringApplication.run(Dept_8989.class,args);
    }
}
