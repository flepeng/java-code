package com.flepeng;

import org.junit.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {

    @Test
    public void test1() {
        Pattern pattern = Pattern.compile("[\\u4e00-\\u9fa5]+|[a-zA-Z]+");
        Matcher matcher = pattern.matcher("adfsfasdfDddsfsa0456asd_asadad");
        ArrayList result = new ArrayList();

        while (matcher.find()) {
            result.add(matcher.group());
        }
        System.out.println(result);
    }

    @Test
    public void test2() {
        // 从左到右
        System.out.println("123\u202A456 789\u202C");

        // 从右到左，方向串内部的顺序不变，方向串的顺序变成从右到左
        System.out.println("123456\u202B@qq.com\u202C");
        System.out.println("\u202B123456@qq.com\u202C");
        System.out.println("\u202B12.34:56\u202C@qq.com\u202C");
        System.out.println("\u202B12.34-56@qq.com\u202C");
        System.out.println("\u202B12.3(45)6@qq.com\u202C");
        System.out.println("\u202B12.34:56@qq.com\u202C");

        System.out.println("123\u202D456 789\u202C");
        System.out.println("123\u202E456 789\u202C");

        System.out.println("123\u200E456789");
        System.out.println("123\u200F456789");
        System.out.println("\u200F" + "123-456@qq.com.2345");
        System.out.println("\u200F123\u200F-456@qq.com.2345");
        System.out.println("\u200F123-456@qq.com.\u200F2345");
//        System.out.println("123-456@q\u200Fq.com");
//        System.out.println("\u200Fphone:(415)555-3695");
//        System.out.println("\u200Ephone:(415)555-3695");
//        System.out.println("هاتف:(415)555-3695");
//        System.out.println("\u200F هاتف:(415)555-3695");
//        System.out.println("هاتف:(415)555-3695\u200E");



    }
}
