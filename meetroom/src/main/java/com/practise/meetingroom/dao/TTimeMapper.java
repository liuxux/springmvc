package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.TTime;
import com.practise.meetingroom.model.TTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTimeMapper {
    int countByExample(TTimeExample example);

    int deleteByExample(TTimeExample example);

    int deleteByPrimaryKey(Integer timeId);

    int insert(TTime record);

    int insertSelective(TTime record);

    List<TTime> selectByExample(TTimeExample example);

    TTime selectByPrimaryKey(Integer timeId);

    int updateByExampleSelective(@Param("record") TTime record, @Param("example") TTimeExample example);

    int updateByExample(@Param("record") TTime record, @Param("example") TTimeExample example);

    int updateByPrimaryKeySelective(TTime record);

    int updateByPrimaryKey(TTime record);
}