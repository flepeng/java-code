package com.flepeng.demo.mybatis.mapper;


import com.flepeng.demo.mybatis.domain.Order;

import java.util.List;

public interface OrderMapper {

    //查询全部的方法
    public List<Order> findAll();

}
