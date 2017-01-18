package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.TMeetingroomDevice;
import com.practise.meetingroom.model.TMeetingroomDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMeetingroomDeviceMapper {
    int countByExample(TMeetingroomDeviceExample example);

    int deleteByExample(TMeetingroomDeviceExample example);

    int deleteByPrimaryKey(Integer tableId);

    int insert(TMeetingroomDevice record);

    int insertSelective(TMeetingroomDevice record);

    List<TMeetingroomDevice> selectByExample(TMeetingroomDeviceExample example);

    TMeetingroomDevice selectByPrimaryKey(Integer tableId);

    int updateByExampleSelective(@Param("record") TMeetingroomDevice record, @Param("example") TMeetingroomDeviceExample example);

    int updateByExample(@Param("record") TMeetingroomDevice record, @Param("example") TMeetingroomDeviceExample example);

    int updateByPrimaryKeySelective(TMeetingroomDevice record);

    int updateByPrimaryKey(TMeetingroomDevice record);
}