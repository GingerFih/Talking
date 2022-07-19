package com.qcby.entity;

import java.util.Date;

public class Ban {
    private Integer id;
    private String account;
    private String account_ban;
    private Date bantime;
    private String username;
    private Integer banid;
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

    public String getAccount_ban() {
        return account_ban;
    }

    public void setAccount_ban(String account_ban) {
        this.account_ban = account_ban;
    }

    public Date getBantime() {
        return bantime;
    }

    public void setBantime(Date bantime) {
        this.bantime = bantime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getBanid() {
        return banid;
    }

    public void setBanid(Integer banid) {
        this.banid = banid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "Ban{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", account_ban='" + account_ban + '\'' +
                ", bantime=" + bantime +
                ", username='" + username + '\'' +
                ", banid=" + banid +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }
}
