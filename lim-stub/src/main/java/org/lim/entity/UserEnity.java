package org.lim.entity;

public class UserEnity {
    private Integer userId;
    private String userName;

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
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserEnity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
