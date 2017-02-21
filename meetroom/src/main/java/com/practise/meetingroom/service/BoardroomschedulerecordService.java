package com.practise.meetingroom.service;

import com.practise.meetingroom.dao.BoardroomschedulerecordMapper;
import com.practise.meetingroom.model.Boardroomschedulerecord;
import com.practise.meetingroom.model.BoardroomschedulerecordExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BoardroomschedulerecordService {
    @Autowired
    BoardroomschedulerecordMapper boardroomschedulerecordMapper;

    public List<Boardroomschedulerecord> getSearch(String topicName, String meetingroomName, String account, String scheduletime, String endtime, String type){
        //根据参数写出sql查询语句
//        String sql;
//        sql= "select topicName,meetingroomName,account,scheduleTime,endTime,type from boardroomschedulerecord where " +
//                "scheduleTime ="+ scheduletime +"endTime = "+ endtime;
//        if(topicName!=null)
//            sql = sql + " and topicName = "+topicName;
//        if(meetingroomName!=null)
//            sql = sql + " and meetingroomName = "+meetingroomName;
////        if(account = user)
////            sql = sql + " and account = "+ account;
//        if(type == "canceled")
//            sql = sql + " and canceled = '1'";
//        else if(type == "scheduled")
//            sql = sql + " and time <="+scheduletime+" and canceled = '0'";
//        else if(type == "ended")
//            sql = sql + " and time >="+endtime+" and canceled = '0'";
//        else if(type == "ongoing")
//            sql = sql + " and time <="+endtime+" and time >="+scheduletime+"and canceled = '0'";
//        List<Boardroomschedulerecord> list = boardroomschedulerecordMapper.searchByUser(sql);//数据库查询结果
////        return list;
//        return null;
        BoardroomschedulerecordExample example = new BoardroomschedulerecordExample();
        BoardroomschedulerecordExample.Criteria criteria = example.createCriteria();
        criteria.andTopicnameEqualTo(topicName);
        if(topicName == null)
            criteria.andTopicnameIsNull();

        criteria.andMeetingNameEqualTo(topicName);
        if(meetingroomName == null)
            criteria.andMeetingNameIsNull();

//        criteria.andScheduletimeEqualTo(scheduletime);
//        criteria.andScheduletimeIsNotNull();
//
//        criteria.andScheduletimeEqualTo(endtime);
//        criteria.andScheduletimeIsNotNull();

        criteria.andAccountEqualTo(account);
        criteria.andAccountIsNotNull();
        example.setOrderByClause("username asc");
//        List<Boardroomschedulerecord> boardroomschedulerecordList = BoardroomschedulerecordMapper.selectByExampleSelective(example);
//        //返回的数据查询结果
//        if (boardroomschedulerecordList!=null&&boardroomschedulerecordList.size()>0) {
//            return boardroomschedulerecordList;
//        }
        return null;
    }

}
