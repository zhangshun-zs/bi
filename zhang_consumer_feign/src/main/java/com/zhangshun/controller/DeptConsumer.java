package com.zhangshun.controller;


import com.zhangshun.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumer {

    //消费者不应该有service层
    //将RestTemplate 注册到spring中

    @Autowired//提供多种便捷访问远程http服务的方法，简单的Restful服务模板
    private RestTemplate restTemplate;


    private static final String URL_Head = "http://ZHANG-PROVIDER";


    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(URL_Head+"/dept/queryByid?id="+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(URL_Head+"/dept/queryAll",List.class);
    }
}
