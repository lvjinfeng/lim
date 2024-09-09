package org.lim.entity;

public class ChatEntity {
    String name;
    Integer userId;
    String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ChatEntity{" +
                "name='" + name + '\'' +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                '}';
    }
}
