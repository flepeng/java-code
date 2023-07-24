package com.flepeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot工程都有一个启动引导类，这是工程的入口类
 * 并在引导类上添加@SpringBootApplication
 */

//声明该类是一个SpringBoot引导类
@SpringBootApplication
// 扫描mybatis所有的业务mapper接口
@MapperScan("com.flepeng.mapper")
public class Application {

    //main是java程序的入口
    public static void main(String[] args) {
        //run方法 表示运行SpringBoot的引导类  run参数就是SpringBoot引导类的字节码对象
        SpringApplication.run(Application.class);
    }
}
