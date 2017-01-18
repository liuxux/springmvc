package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.TMeetingroom;
import com.practise.meetingroom.model.TMeetingroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMeetingroomMapper {
    int countByExample(TMeetingroomExample example);

    int deleteByExample(TMeetingroomExample example);

    int deleteByPrimaryKey(Integer meetingroomId);

    int insert(TMeetingroom record);

    int insertSelective(TMeetingroom record);

    List<TMeetingroom> selectByExample(TMeetingroomExample example);

    TMeetingroom selectByPrimaryKey(Integer meetingroomId);

    int updateByExampleSelective(@Param("record") TMeetingroom record, @Param("example") TMeetingroomExample example);

    int updateByExample(@Param("record") TMeetingroom record, @Param("example") TMeetingroomExample example);

    int updateByPrimaryKeySelective(TMeetingroom record);

    int updateByPrimaryKey(TMeetingroom record);
}