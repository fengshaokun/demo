package com.yikun.demo.service;

import com.yikun.demo.po.Account;

import java.util.List;

public interface AcountMapperService {

    List<Account> list();
    void addAccount(Account account);
    List<Account> selectAllById(List<String>accounts);
    List<Account> selectAllById2(String id);


}
