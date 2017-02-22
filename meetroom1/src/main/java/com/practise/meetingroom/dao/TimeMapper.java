package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.Time;
import com.practise.meetingroom.model.TimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeMapper {
    int countByExample(TimeExample example);

    int deleteByExample(TimeExample example);

    int deleteByPrimaryKey(Integer timeId);

    int insert(Time record);

    int insertSelective(Time record);

    List<Time> selectByExample(TimeExample example);

    Time selectByPrimaryKey(Integer timeId);

    int updateByExampleSelective(@Param("record") Time record, @Param("example") TimeExample example);

    int updateByExample(@Param("record") Time record, @Param("example") TimeExample example);

    int updateByPrimaryKeySelective(Time record);

    int updateByPrimaryKey(Time record);
}