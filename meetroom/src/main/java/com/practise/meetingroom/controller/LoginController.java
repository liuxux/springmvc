package com.practise.meetingroom.controller;

import com.practise.meetingroom.model.User;
import com.practise.meetingroom.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 登陆控制器
 * Created by 辛佳庆1.0 on 2017/2/15.
 */
@Controller
@RequestMapping(value = "/log")//url除域名外部分 匹配
public class LoginController {
   // private Logger logger = Logger.getLogger(this.getClass());
    @Autowired               //service
    private UserService userService;

    @RequestMapping(value = "/log/listall", method = RequestMethod.POST)
    @ResponseBody//转为json传给前端
    //接受前端信息
    public ModelAndView listAll(HttpServletRequest request) throws Exception {
        //参数解析  将获取到的参数 记录下来
        // 定义类型 并标明接收的数据类型
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", username);
        map.put("password", password);
        // 将参数交给service做查询 调用service中的方法 返回的结果 交给List<User>
        List<User> userList = userService.selectUser(username, password);
        //如果返回结果为空
        if (userList == null) {
            System.out.println();
        }
        //service 将结果返回给前端
        //返回类型为数组  json 格式给前端

        //service 请求回来的table对象中取出
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("login", userList);
        return mav;

    }

}
