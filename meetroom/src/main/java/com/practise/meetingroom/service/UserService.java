package com.practise.meetingroom.service;

import com.practise.meetingroom.dao.UserMapper;
import com.practise.meetingroom.model.User;
import com.practise.meetingroom.model.UserExample;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


/**
 * Created by 辛佳庆1.0 on 017/2/15.
 */
@Service("userService")
public class UserService {
    @Resource(name = "userMapper")
    public UserMapper userMapper;


    //根据参数作为查询条件 用sql语句进行查询
    public List<User> selectUser(String username, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(username);
        criteria.andUserNameIsNotNull();

        criteria.andPasswordEqualTo(password);
        criteria.andPasswordIsNotNull();
        example.setOrderByClause("username asc");
        List<User> userList = userMapper.selectByExample(example);
        ;//返回的数据查询结果
         if (userList!=null&&userList.size()>0) {
             return userList;
         }
        return null;
    }
//    public User adduser(phoneNum,username,password,e_mail,department,grantCode){
//
//    }
}
