package com.apec.framework.dto;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/2/14 15:13
 * 编码作者：zhaolei
 */
public class OrderCouponDTO {
    private long id;
    private String couponName;
    private long couponRuleId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public long getCouponRuleId() {
        return couponRuleId;
    }

    public void setCouponRuleId(long couponRuleId) {
        this.couponRuleId = couponRuleId;
    }
}
