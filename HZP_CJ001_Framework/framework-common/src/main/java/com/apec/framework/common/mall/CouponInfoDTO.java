package com.apec.framework.common.mall;

import java.util.Date;
import java.sql.Timestamp;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-11-18 10:19
 * 编码作者：zhaolei
 */
public class CouponInfoDTO {
    private long id;
    private Long buyId;
    private Integer saleId;
    private Byte ownWay;
    private Timestamp ownTime;
    private Date startDate;
    private Date endDate;
    private CouponRuleDTO couponRule;
    private String status;
    private Timestamp useTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getBuyId() {
        return buyId;
    }

    public void setBuyId(Long buyId) {
        this.buyId = buyId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Byte getOwnWay() {
        return ownWay;
    }

    public void setOwnWay(Byte ownWay) {
        this.ownWay = ownWay;
    }

    public Timestamp getOwnTime() {
        return ownTime;
    }

    public void setOwnTime(Timestamp ownTime) {
        this.ownTime = ownTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public CouponRuleDTO getCouponRule() {
        return couponRule;
    }

    public void setCouponRule(CouponRuleDTO couponRule) {
        this.couponRule = couponRule;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getUseTime() {
        return useTime;
    }

    public void setUseTime(Timestamp useTime) {
        this.useTime = useTime;
    }
}
