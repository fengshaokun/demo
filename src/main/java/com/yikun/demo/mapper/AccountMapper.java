package com.yikun.demo.mapper;


import com.yikun.demo.po.Account;


import java.util.List;

public interface AccountMapper {

    List<Account>  selectAll();



    List<Account> selectAllById(List<String>ids);


   void addAccount(Account account);
    List<Account> selectAllById2(String id);



}
