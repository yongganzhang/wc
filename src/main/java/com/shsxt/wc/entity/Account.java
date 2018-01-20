package com.shsxt.wc.entity;

import java.util.Date;

public class Account {
    /**
     * id
     * 
     */
    private Integer id;

    /**
     * aname
     * 账户名称
     */
    private String aname;

    /**
     * type
     * 类型
     */
    private String type;

    /**
     * money
     * 金额
     */
    private Double money;

    /**
     * remark
     * 备注
     */
    private String remark;

    /**
     * user_id
     * 用户id
     */
    private Integer userId;

    /**
     * create_time
     * 创建时间
     */
    private Date createTime;

    /**
     * update_time
     * 更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}