package com.yikun.demo.service.impl;

import com.yikun.demo.mapper.AccountMapper;
import com.yikun.demo.po.Account;
import com.yikun.demo.service.AcountMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class AccountMapperServiceImpl implements AcountMapperService {


    @Autowired
    AccountMapper accountMapper;

    @Override
    @Transactional
    public List<Account> list() {
        return accountMapper.selectAll();
    }

    @Override
    public void addAccount(Account account) {
        accountMapper.addAccount(account);
    }

    @Override
    public List<Account> selectAllById(List<String> accounts) {

        return accountMapper.selectAllById(accounts);
    }

    @Override
    public List<Account> selectAllById2(String id) {

        return accountMapper.selectAllById2(id);
    }
}
