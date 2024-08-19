package com.lvchenglong.biz.domain;

import java.util.Date;

/**
 * 用户表绑定微信openid表（表：member_bind_wx_openid）
 *
 * @author 城北吕公
 */
public class MemberBindWxOpenId {
    /**
     * 
     */
    private Long id;

    /**
     * 小程序或者公众号appid
     */
    private String appId;

    /**
     * 微信openid
     */
    private String openId;

    /**
     * 用户id
     */
    private Long memberId;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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

    public void initDefault() {
    }

    public void initUpdate() {
    }
}