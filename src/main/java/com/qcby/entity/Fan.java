package com.qcby.entity;

import java.util.Date;

public class Fan {
    private Integer id;
    private String account;
    private String account_fan;
    private Date fantime;
    private String username;
    private Integer fanid;
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

    public String getAccount_fan() {
        return account_fan;
    }

    public void setAccount_fan(String account_fan) {
        this.account_fan = account_fan;
    }

    public Date getFantime() {
        return fantime;
    }

    public void setFantime(Date fantime) {
        this.fantime = fantime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getFanid() {
        return fanid;
    }

    public void setFanid(Integer fanid) {
        this.fanid = fanid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", account_fan='" + account_fan + '\'' +
                ", fantime=" + fantime +
                ", username='" + username + '\'' +
                ", fanid=" + fanid +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }
}
