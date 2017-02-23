package com.practise.meetingroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "/login";
    }

    /**
     * 个人注册页
     */
    @RequestMapping("/psign")

    public String personalregistered() {
        return "/psign";
    }

    @RequestMapping("/psignSuccess")

    public String p_success() {
        return "/psignSuccess";
    }

    /**
     * 企业注册页
     */
    @RequestMapping("/csign")

    public String company() {
        return "/csign";
    }

    @RequestMapping("/cnext")

    public String next() {
        return "/cnext";
    }

    @RequestMapping("/csuccess")

    public String success() {
        return "/csuccess";
    }

    @RequestMapping("/bookMeetingroom")

    public String bookMeetingroom() {
        return "/bookMeetingroom";
    }


}
