package com.datamanager.server.api.systemmanager.usermanager.model;

import java.io.Serializable;

/**
 * 用户表
 */
public class UserVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private long userId;//用户id 64位全局唯一，基于snowflake算法生成
    private String userName;//用户名
    private String userPassword;//密码
    private String userEmail;//邮箱
    private String userMobile;//手机号
    private String userSalt;//为分布式session使用

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", userSalt='" + userSalt + '\'' +
                '}';
    }
}
