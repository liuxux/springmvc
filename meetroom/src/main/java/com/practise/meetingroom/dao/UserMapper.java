package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.User;

import java.util.List;
import java.util.Map;

import com.practise.meetingroom.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper{

          int countByExample(UserExample example);

          int deleteByExample(UserExample example);

          int deleteByPrimaryKey(Long userId);

          int insert(User record);

          int insertSelective(User record);

          List<User> selectByExample(UserExample example);

          User selectByPrimaryKey(Integer userId);

          int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

          int updateByExample(@Param("record") User record, @Param("example") UserExample example);

          int updateByPrimaryKeySelective(User record);

          int updateByPrimaryKey(User record);
          /**
           * 用户登录验证查询
           *
           * @param record
           * @return
           */
          User authentication(@Param("record") User record);

          User login(Map<String, Object> map);

          List<User> mapUser(Map<String, Object> map);

}