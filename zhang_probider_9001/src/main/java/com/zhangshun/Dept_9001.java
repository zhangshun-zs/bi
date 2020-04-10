package com.zhangshun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//启动类
@SpringBootApplication
@EnableEurekaClient  //服务启动后 自动注册到eureka中  类似于zookeeper
public class Dept_9001 {
    public static void main(String[] args) {
        SpringApplication.run(Dept_9001.class,args);
    }
}
