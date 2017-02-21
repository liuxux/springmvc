package com.practise.meetingroom.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

public class User {
    private Integer userId;
    @NotNull(message = "用户名不能为空")
    private String userName;
    @NotNull(message = "密码不能为空")
    private String password;
    @Email(message = "邮箱格式错误")
    private String userEmail;
    @Length(min = 11, max = 11, message = "手机号码长度不等于11位")
    private Integer userPhone;

    private String authcode;

    private String department;

    private String registmark;

    private Boolean manager;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public String getAuthcode() {
        return authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode == null ? null : authcode.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getRegistmark() {
        return registmark;
    }

    public void setRegistmark(String registmark) {
        this.registmark = registmark == null ? null : registmark.trim();
    }

    public Boolean getManager() {
        return manager;
    }

    public void setManager(Boolean manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone=" + userPhone +
                ", authcode='" + authcode + '\'' +
                ", department='" + department + '\'' +
                ", registmark='" + registmark + '\'' +
                ", manager=" + manager +
                '}';
    }
}