package com.flepeng.order.service;

import com.flepeng.bean.OrderInfo;
import com.flepeng.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*====================================================
                时间: 2022-06-21
                讲师: 刘  辉
                出品: 尚硅谷讲师团队
======================================================*/
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Transactional(readOnly = true)
    public List<OrderInfo> getUserInfo(Integer uid) {
       return orderMapper.getOrderList(uid);
    }
}
