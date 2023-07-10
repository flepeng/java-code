package com.flepeng.demo.ssm.mapper;

import com.flepeng.demo.ssm.domain.Account;

import java.util.List;

public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();

}
