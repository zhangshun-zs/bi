package com.zhangshun.control;


import com.zhangshun.entity.Dept;
import com.zhangshun.server.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//提供restful服务
@RestController
public class DeptControl {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/dept/add")
    //添加一个部门
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    //根据id查询
    @GetMapping("/dept/queryByid")
    public Dept queryById(Integer id){
        System.out.println(id);
        return deptService.queryById(id);
    }


    @GetMapping("/dept/queryAll")
    //查询所有部门
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<ServiceInstance> instances = client.getInstances("ZHANG-PROVIDER");

        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"/"+
                            instance.getPort()+"/n"+
                            instance.getInstanceId()
            );
        }
        return client;
    }
}
