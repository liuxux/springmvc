package com.practise.meetingroom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 公共视图控制
 */
@Controller
public class MainController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        return "index";
    }

}