package com.yikun.demo.controller;


import com.yikun.demo.po.Account;
import com.yikun.demo.service.AcountMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AcountMapperService acountMapperService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Account> getAllAccounts() {
        return acountMapperService.list();
    }

    @RequestMapping(value = "/allById", method = RequestMethod.GET)
    public List<Account> getAllAccountsById() {

        List<String> ids = new ArrayList<>();
        ids.add("1");
        ids.add("2");

        return acountMapperService.selectAllById(ids);
    }

    @RequestMapping(value = "/allById2", method = RequestMethod.GET)
    public List<Account> getAllAccountsById2() {

        String id = "(1,2)";

        return acountMapperService.selectAllById2(id);
    }

}