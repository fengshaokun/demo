package com.yikun.demo.controller;

import java.io.PrintWriter;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/weixin")
public class WeiXin {


    private static String WECHAT_TOKEN = "WADJFSASF"; //WECHAT_TOKEN和你申请时填写的Token一样

    @RequestMapping(value = "/verityToken")
    public void get(HttpServletRequest request, HttpServletResponse response) throws Exception {



        Enumeration pNames = request.getParameterNames();
        while (pNames.hasMoreElements()) {
            String name = (String) pNames.nextElement();
            String value = request.getParameter(name);
            String log = "name =" + name + "     value =" + value;

        }

        String signature = request.getParameter("signature");/// 微信加密签名
        String timestamp = request.getParameter("timestamp");/// 时间戳
        String nonce = request.getParameter("nonce"); /// 随机数
        String echostr = request.getParameter("echostr"); // 随机字符串
        PrintWriter out = response.getWriter();
        out.print(echostr);
        out.close();
    }
}
