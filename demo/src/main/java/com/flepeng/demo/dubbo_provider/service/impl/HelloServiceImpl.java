package com.flepeng.demo.dubbo_provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.flepeng.demo.dubbo_provider.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = HelloService.class,protocol = "dubbo") //发布服务必须使用Dubbo提供的Service注解,在Service注解中加入interfaceClass属性，值为HelloService.class，作用是指定服务的接口类型
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "8083 hello " + name;
    }
}
