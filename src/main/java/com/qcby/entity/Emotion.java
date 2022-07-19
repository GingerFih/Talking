package com.qcby.entity;

import java.util.Date;

public class Emotion {
    //贴子id
    private Integer id;
    //贴子名称
    private String name;
    //发帖时间
    private Date postime;
    //作者
    private String author;
    private Integer likecount;
    private Integer postcount;

    private String classify;

    private String content;

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public Integer getPostcount() {
        return postcount;
    }

    public void setPostcount(Integer postcount) {
        this.postcount = postcount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPostime() {
        return postime;
    }

    public void setPostime(Date postime) {
        this.postime = postime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Emotion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postime=" + postime +
                ", author='" + author + '\'' +
                ", likecount=" + likecount +
                ", postcount=" + postcount +
                ", classify='" + classify + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
