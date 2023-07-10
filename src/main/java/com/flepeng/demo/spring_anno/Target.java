package com.flepeng.demo.spring_anno;

import org.springframework.stereotype.Component;

@Component("target")
public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running.....");
        //int i = 1/0;
    }
}
