package com.lvchenglong.biz.domain;

import java.util.Date;

/**
 * 租户表（表：tenant）
 *
 * @author 城北吕公
 */
public class Tenant {
    /**
     * 
     */
    private Long id;

    /**
     * 租户名称
     */
    private String name;

    /**
     * 是否禁用
     */
    private Boolean disable;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 管理员id
     */
    private Long adminId;

    /**
     * 修改管理员id
     */
    private Long updateAdminId;

    /**
     * 是否删除，0：删除；1：未删除
     */
    private Boolean delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
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

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getUpdateAdminId() {
        return updateAdminId;
    }

    public void setUpdateAdminId(Long updateAdminId) {
        this.updateAdminId = updateAdminId;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public void initDefault() {
    }

    public void initUpdate() {
    }
}