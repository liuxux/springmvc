package com.practise.meetingroom.controller;

import com.practise.meetingroom.message.BoardroomschedulerecordMessager;
import com.practise.meetingroom.model.Boardroomschedulerecord;
import com.practise.meetingroom.service.BoardroomschedulerecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by cheng on 2017/2/21.
 */
@Controller
public class BoardroomschedulerecordController {
    @Autowired
    private BoardroomschedulerecordService boardroomschedulerecordService;

    @ResponseBody
    @RequestMapping(value = "/search")
    //接受前端发送请求后进行查询
    public List<BoardroomschedulerecordMessager> getSearch(HttpServletRequest request, HttpSession session){
        //得到所有参数，对应所有查询条件
        String topicName = request.getParameter("topicName");//主题名称
        String meetingroomName = request.getParameter("meetingroomName");//会议室名称
        String account = request.getParameter("account");
        String scheduletime = request.getParameter("scheduletime");
        String endtime = request.getParameter("endtime");
        String type = request.getParameter("type");
        List<Boardroomschedulerecord> msg;
        msg = boardroomschedulerecordService.getSearch(topicName, meetingroomName, account, scheduletime, endtime, type);//把参数扔给service进行查询
        List<BoardroomschedulerecordMessager> returnMessager = null;
        return returnMessager;
    }

    @RequestMapping(value = "/cancel")
    public String getCanceled(HttpServletRequest request,HttpSession session){
        String topicName = request.getParameter("topicName");
        String meetingroomName = request.getParameter("meetingroomName");
        String account = request.getParameter("account");
        String scheduletime = request.getParameter("scheduleTime");
        String endtime = request.getParameter("endTime");
        String type = request.getParameter("type");
        return "";
    }
}
