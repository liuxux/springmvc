package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.TBoardroomtime;
import com.practise.meetingroom.model.TBoardroomtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBoardroomtimeMapper {
    int countByExample(TBoardroomtimeExample example);

    int deleteByExample(TBoardroomtimeExample example);

    int deleteByPrimaryKey(Integer tableId);

    int insert(TBoardroomtime record);

    int insertSelective(TBoardroomtime record);

    List<TBoardroomtime> selectByExample(TBoardroomtimeExample example);

    TBoardroomtime selectByPrimaryKey(Integer tableId);

    int updateByExampleSelective(@Param("record") TBoardroomtime record, @Param("example") TBoardroomtimeExample example);

    int updateByExample(@Param("record") TBoardroomtime record, @Param("example") TBoardroomtimeExample example);

    int updateByPrimaryKeySelective(TBoardroomtime record);

    int updateByPrimaryKey(TBoardroomtime record);
}