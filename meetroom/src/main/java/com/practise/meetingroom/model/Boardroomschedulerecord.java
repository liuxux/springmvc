package com.practise.meetingroom.model;

import java.util.Date;

public class Boardroomschedulerecord {
    private Integer recordId;

    private String topicname;

    private String meetingName;

    private String account;

    private Date scheduletime;

    private Date endTime;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname == null ? null : topicname.trim();
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Date getScheduletime() {
        return scheduletime;
    }

    public void setScheduletime(Date scheduletime) {
        this.scheduletime = scheduletime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}