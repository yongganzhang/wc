package com.shsxt.wc.entity;

public class User {
    /**
     * id
     * id
     */
    private Integer id;

    /**
     * user_name
     * 用户名称
     */
    private String userName;

    /**
     * user_pwd
     * 用户密码
     */
    private String userPwd;

    /**
     * is_del
     * 是否删除(0未删除 1删除)
     */
    private String isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }
}