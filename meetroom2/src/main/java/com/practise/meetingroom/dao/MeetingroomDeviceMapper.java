package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.MeetingroomDevice;
import com.practise.meetingroom.model.MeetingroomDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingroomDeviceMapper {
    int countByExample(MeetingroomDeviceExample example);

    int deleteByExample(MeetingroomDeviceExample example);

    int deleteByPrimaryKey(Integer tableId);

    int insert(MeetingroomDevice record);

    int insertSelective(MeetingroomDevice record);

    List<MeetingroomDevice> selectByExample(MeetingroomDeviceExample example);

    MeetingroomDevice selectByPrimaryKey(Integer tableId);

    int updateByExampleSelective(@Param("record") MeetingroomDevice record, @Param("example") MeetingroomDeviceExample example);

    int updateByExample(@Param("record") MeetingroomDevice record, @Param("example") MeetingroomDeviceExample example);

    int updateByPrimaryKeySelective(MeetingroomDevice record);

    int updateByPrimaryKey(MeetingroomDevice record);
}