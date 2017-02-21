package com.practise.meetingroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 辛佳庆1.0 on 2017/2/17.
 * 视图控制
 */
@Controller
@RequestMapping("/page")
public class PageController {
    /**
     * 登录页
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 个人注册页
     */
    @RequestMapping("/personalregistered")
    public String personalregistered() {
        return "personalregistered";
    }

    @RequestMapping("/p-success")
    public String p_success() {
        return "p-succcess";
    }

    /**
     * 企业注册页
     */
    @RequestMapping("/company")
    public String company() {
        return "company";
    }

    @RequestMapping("/next")
    public String next() {
        return "company-next";
    }

    @RequestMapping("/success")
    public String success() {
        return "company-success";
    }

}
