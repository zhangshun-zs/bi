package com.zhangshun.config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.Templates;

@Configuration
public class ConfigBean {//相当于spring applicationContext.xml


    @Bean
    public RestTemplate getrestTemplate(){
        return new RestTemplate();
    }
}
