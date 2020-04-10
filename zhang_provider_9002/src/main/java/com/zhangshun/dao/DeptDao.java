package com.zhangshun.dao;


import com.zhangshun.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DeptDao {

    //添加一个部门
    public boolean addDept(Dept dept);

    //根据id查询
    public Dept queryById(Integer id);

    //查询所有部门
    public List<Dept> queryAll();
}
