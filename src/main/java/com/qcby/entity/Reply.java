package com.qcby.entity;


import java.util.Date;

public class Reply {
    private String title;
    private String content;
    private String reply_account;
    private Integer account_id;
    private String account;
    private String images;
    private Integer lowc_id;
    private Integer likecount;
    private Date postime;
    private String username;
    private Integer id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getLowc_id() {
        return lowc_id;
    }

    public void setLowc_id(Integer lowc_id) {
        this.lowc_id = lowc_id;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public Date getPostime() {
        return postime;
    }

    public void setPostime(Date postime) {
        this.postime = postime;
    }

    public String getReply_account() {
        return reply_account;
    }

    public void setReply_account(String reply_account) {
        this.reply_account = reply_account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", reply_account='" + reply_account + '\'' +
                ", account_id=" + account_id +
                ", account='" + account + '\'' +
                ", images='" + images + '\'' +
                ", lowc_id=" + lowc_id +
                ", likecount=" + likecount +
                ", postime=" + postime +
                ", username='" + username + '\'' +
                ", id=" + id +
                '}';
    }
}
