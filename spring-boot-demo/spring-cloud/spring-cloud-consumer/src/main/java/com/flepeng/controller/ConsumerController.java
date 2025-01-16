package com.flepeng.controller;

import com.flepeng.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
@Slf4j
@DefaultProperties(defaultFallback = "defaultFallback")  // 默认的熔断配置,在类上指明统一的失败降级方法；该类中所有方法返回类型要与处理失败的方法的返回类型一致。
@RefreshScope // 使用配置中心获取配置时，需要配置。
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserClient userClient;

    @Value("${test.name}")
    private String name;

    @GetMapping("{id}")
//    @HystrixCommand(fallbackMethod = "queryByIdFallback")  // 熔断配置
    public User queryById(@PathVariable Long id){


        /*
        // 第一次：直接使用地址
        String url = "http://localhost:9091/user/" + id;
        return restTemplate.getForObject(url, User.class);
         */

        /*
        // 第二次，使用实例名获取地址
        //获取eureka中注册的user-service实例列表
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance = serviceInstanceList.get(0);
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id;
        return restTemplate.getForObject(url, User.class);
        */

        /*
        // 第三次：开启 LoadBalance 负载均衡
        String url = "http://user-service/user/" + id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
        */

        return userClient.queryById(id);
    }

    public String queryByIdFallback(Long id){
        log.error("查询用户信息失败。id：{}", id);
        return "对不起，网络太拥挤了！";
    }

    public String defaultFallback(){
        return "默认提示：对不起，网络太拥挤了！";
    }
}
