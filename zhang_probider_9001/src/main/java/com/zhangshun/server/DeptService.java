package com.zhangshun.server;

import com.zhangshun.entity.Dept;

import java.util.List;

public interface DeptService {

    //添加一个部门
    public boolean addDept(Dept dept);

    //根据id查询
    public Dept queryById(Integer id);

    //查询所有部门
    public List<Dept> queryAll();
}
