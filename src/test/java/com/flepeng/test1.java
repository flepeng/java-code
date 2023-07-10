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
}
