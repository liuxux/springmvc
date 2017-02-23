package com.practise.meetingroom.controller;

import com.practise.meetingroom.dao.UserMapper;
import com.practise.meetingroom.model.User;
import com.practise.meetingroom.service.RegisterService;
import com.practise.meetingroom.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 注册控制器
 * Created by 辛佳庆1.0 on 2017/2/15.
 */
@Controller
@RequestMapping(value = "/register")
public class RegisterController {
    @Resource
    private RegisterService registerService;

    @RequestMapping(value = "/sign", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView register(HttpServletRequest request) throws Exception {
        //获取前端用户注册信息 并保存在变量中

        Integer phoneNum = Integer.parseInt(request.getParameter("phoneNum"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String e_mail = request.getParameter("e_mail");
        String registMark = request.getParameter("registMark");
        String authCode = request.getParameter("authCode");
        String department = request.getParameter("department");
        Boolean manager = Boolean.valueOf(request.getParameter("manager"));
        List<User> users = registerService.insert(phoneNum,
                username,
                password,
                e_mail,
                registMark,
                department,
                authCode,
                manager);
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("/sign", users);

        return mav;
    }

    public void setRegisterService(RegisterService registerService) {
        this.registerService = registerService;
    }
}
