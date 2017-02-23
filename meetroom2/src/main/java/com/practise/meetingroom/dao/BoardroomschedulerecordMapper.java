package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.Boardroomschedulerecord;
import com.practise.meetingroom.model.BoardroomschedulerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardroomschedulerecordMapper {
    int countByExample(BoardroomschedulerecordExample example);

    int deleteByExample(BoardroomschedulerecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(Boardroomschedulerecord record);

    int insertSelective(Boardroomschedulerecord record);

    List<Boardroomschedulerecord> selectByExample(BoardroomschedulerecordExample example);

    Boardroomschedulerecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") Boardroomschedulerecord record, @Param("example") BoardroomschedulerecordExample example);

    int updateByExample(@Param("record") Boardroomschedulerecord record, @Param("example") BoardroomschedulerecordExample example);

    int updateByPrimaryKeySelective(Boardroomschedulerecord record);

    int updateByPrimaryKey(Boardroomschedulerecord record);
}