package com.practise.meetingroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Constraint;

/**
 * Created by 辛佳庆1.0 on 2017/2/21.
 */
@RequestMapping("/book")
@Controller
public class BookingController {

@RequestMapping("/login")
public String login(){
    return "/login/login";
}
@RequestMapping("/bookMeetingroom")
public String book(){return "/register/bookMeetingroom";}
}
