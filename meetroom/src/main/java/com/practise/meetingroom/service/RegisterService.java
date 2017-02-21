package com.practise.meetingroom.service;

import com.practise.meetingroom.dao.UserMapper;
import com.practise.meetingroom.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 辛佳庆1.0 on 2017/2/18.
 */
@Service
public class RegisterService {
    @Resource
    public UserMapper userMapper;

    public List<User> insert(Integer phone,
                             String username,
                             String password,
                             String email,
                             String registMark,
                             String authCode,
                             String department,
                             Boolean manager) {
        List<User> userList = new ArrayList<User>();
        User user = new User();
        user.setUserPhone(phone);
        user.setUserName(username);
        user.setPassword(password);
        user.setUserEmail(email);
        user.setRegistmark(registMark);
        user.setAuthcode(authCode);
        user.setDepartment(department);
        user.setManager(manager);
        userList.add(user);
        return userList;

    }
}
