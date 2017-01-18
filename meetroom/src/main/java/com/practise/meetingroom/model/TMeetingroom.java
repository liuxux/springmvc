package com.practise.meetingroom.model;

import java.util.Date;

public class TMeetingroom {
    private Integer meetingroomId;

    private Date createtime;

    private String meetingroomName;

    private String assignmenttime;

    private Integer number;

    private String remarks;

    private Boolean meetingType;

    public Integer getMeetingroomId() {
        return meetingroomId;
    }

    public void setMeetingroomId(Integer meetingroomId) {
        this.meetingroomId = meetingroomId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getMeetingroomName() {
        return meetingroomName;
    }

    public void setMeetingroomName(String meetingroomName) {
        this.meetingroomName = meetingroomName == null ? null : meetingroomName.trim();
    }

    public String getAssignmenttime() {
        return assignmenttime;
    }

    public void setAssignmenttime(String assignmenttime) {
        this.assignmenttime = assignmenttime == null ? null : assignmenttime.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Boolean getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(Boolean meetingType) {
        this.meetingType = meetingType;
    }
}