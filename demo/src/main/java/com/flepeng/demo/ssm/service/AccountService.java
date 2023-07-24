package com.flepeng.demo.ssm.service;

import com.flepeng.demo.ssm.domain.Account;

import java.util.List;

public interface AccountService {

    public void save(Account account);

    public List<Account> findAll();

}
