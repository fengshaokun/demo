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
}
