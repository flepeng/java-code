package com.flepeng.demo.spring_tx.dao;

public interface AccountDao {

    public void out(String outMan, double money);
    public void in(String inMan, double money);

}
