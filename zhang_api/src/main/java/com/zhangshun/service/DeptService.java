package com.zhangshun.service;

import com.zhangshun.entity.Dept;

import java.util.List;


public interface DeptService {

    public Dept getDeptById(Integer id);

    public List<Dept> showAll();

    public Boolean add(Dept dept);

}
