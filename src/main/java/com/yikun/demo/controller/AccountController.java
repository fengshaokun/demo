package com.yikun.demo.controller;


import com.yikun.demo.po.Account;
import com.yikun.demo.service.AcountMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AcountMapperService acountMapperService;



    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Account> getAllAccounts(){
        return acountMapperService.list();
    }


}