package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.Meetingroom;
import com.practise.meetingroom.model.MeetingroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingroomMapper {
    int countByExample(MeetingroomExample example);

    int deleteByExample(MeetingroomExample example);

    int deleteByPrimaryKey(Integer meetingroomId);

    int insert(Meetingroom record);

    int insertSelective(Meetingroom record);

    List<Meetingroom> selectByExample(MeetingroomExample example);

    Meetingroom selectByPrimaryKey(Integer meetingroomId);

    int updateByExampleSelective(@Param("record") Meetingroom record, @Param("example") MeetingroomExample example);

    int updateByExample(@Param("record") Meetingroom record, @Param("example") MeetingroomExample example);

    int updateByPrimaryKeySelective(Meetingroom record);

    int updateByPrimaryKey(Meetingroom record);
}