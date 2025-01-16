package com.flepeng;

import org.junit.Test;

public class test2 {

    @Test
    public void test1() {
        String a = "PURCHASING.VENDOR_PERSON";
        String[] split = a.split("[.]");
        System.out.println(split.length);
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split);
    }
}
