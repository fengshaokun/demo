package com.yikun.demo.comm;

import com.yikun.demo.po.Account;
import com.yikun.demo.service.AcountMapperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class ScheduledTasks {

    @Autowired
    AcountMapperService acountMapperService;

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 4000)
    public void reportCurrentTime() {
       /* List<Account> list = acountMapperService.list();
        acountMapperService.addAccount(list.get(0));
        for (Account l:list){
            System.out.println(l.toString());
        }*/
    }
}