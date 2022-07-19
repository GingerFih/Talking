package com.qcby.entity;

import java.util.Date;

public class Chat {
    private Integer id;
    private String account;
    private String content;
    private Date sendtime;
    private String username;
    private String imgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", content='" + content + '\'' +
                ", sendtime=" + sendtime +
                ", username='" + username + '\'' +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }
}
