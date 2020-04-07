package com.zhangshun.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


//部门实体类@
@Data
@NoArgsConstructor
//链式  ： dept.setId(1).setDept_name("hhahah").setDb_name("dddd")
@Accessors(chain = true)
public class Dept implements Serializable {
    //部门id
    private Integer id;
    //部门名称
    private String dept_name;

    //微服务架构 一个服务对应一个数据库
    private String db_name;

    public Dept(String dept_name) {
        this.dept_name = dept_name;
    }

}
