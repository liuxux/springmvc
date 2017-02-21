package com.practise.meetingroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Constraint;

/**
 * Created by 辛佳庆1.0 on 2017/2/21.
 */
@Controller
public class BookingController {
@RequestMapping("/bookMeetingroom")
public String book(){return "/bookMeetingroom";}
}
