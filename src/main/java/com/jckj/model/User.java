package com.jckj.model;

import java.util.Date;

public class User {

    private String userid;
    private String username;
    private String userportrait;
    private String userphone;
    private int isdelete;
    private Date createtime;
    private Long create;
    private Date updatetime;
    private Long update;
    private int guardianid;

    public User() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserportrait() {
        return userportrait;
    }

    public void setUserportrait(String userportrait) {
        this.userportrait = userportrait;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getCreate() {
        return create;
    }

    public void setCreate(Long create) {
        this.create = create;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getUpdate() {
        return update;
    }

    public void setUpdate(Long update) {
        this.update = update;
    }

    public int getGuardianid() {
        return guardianid;
    }

    public void setGuardianid(int guardianid) {
        this.guardianid = guardianid;
    }
}
