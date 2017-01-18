package com.practise.meetingroom.dao;

import com.practise.meetingroom.model.TDevice;
import com.practise.meetingroom.model.TDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeviceMapper {
    int countByExample(TDeviceExample example);

    int deleteByExample(TDeviceExample example);

    int deleteByPrimaryKey(Integer deviceId);

    int insert(TDevice record);

    int insertSelective(TDevice record);

    List<TDevice> selectByExample(TDeviceExample example);

    TDevice selectByPrimaryKey(Integer deviceId);

    int updateByExampleSelective(@Param("record") TDevice record, @Param("example") TDeviceExample example);

    int updateByExample(@Param("record") TDevice record, @Param("example") TDeviceExample example);

    int updateByPrimaryKeySelective(TDevice record);

    int updateByPrimaryKey(TDevice record);
}