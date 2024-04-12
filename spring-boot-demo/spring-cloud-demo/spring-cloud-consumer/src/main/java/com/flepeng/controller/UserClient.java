package com.flepeng.controller;

import com.flepeng.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")  // @FeignClient ，声明这是一个Feign客户端，同时通过 value 属性指定服务名称。Feign会通过动态代理，帮我们生成实现类。这点跟mybatis的mapper很像
public interface UserClient {
    @GetMapping("/user/{id}")
    User queryById(@PathVariable("id") Long id);
}
