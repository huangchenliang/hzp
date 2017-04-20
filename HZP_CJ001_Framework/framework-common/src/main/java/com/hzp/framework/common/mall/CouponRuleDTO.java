package com.hzp.framework.common.mall;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-11-18 10:20
 * 编码作者：zhaolei
 */
public class CouponRuleDTO {
    private long id;
    private String couponName;
    private String allGoods;
    private String goodsSkuJson;
    private String goodsSkuIds;
    private BigDecimal minAmount;
    private int userLevel;
    private String orderWay;
    private String payWay;
    private String isAbstime;
    private int validDays;
    private Date finalEndDate;
    private int totalCoupon;
    private int ownWay;
    private BigDecimal couponAmount;

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public void setGoodsSkuJson(String goodsSkuJson) {
        this.goodsSkuJson = goodsSkuJson;
    }

    public String getOrderWay() {
        return orderWay;
    }

    public void setOrderWay(String orderWay) {
        this.orderWay = orderWay;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public int getValidDays() {
        return validDays;
    }

    public void setValidDays(int validDays) {
        this.validDays = validDays;
    }

    public Date getFinalEndDate() {
        return finalEndDate;
    }

    public void setFinalEndDate(Date finalEndDate) {
        this.finalEndDate = finalEndDate;
    }

    public int getOwnWay() {
        return ownWay;
    }

    public void setOwnWay(int ownWay) {
        this.ownWay = ownWay;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGoodsSkuJson() {
        return goodsSkuJson;
    }

    public String getAllGoods() {
        return allGoods;
    }

    public void setAllGoods(String allGoods) {
        this.allGoods = allGoods;
    }

    public String getIsAbstime() {
        return isAbstime;
    }

    public void setIsAbstime(String isAbstime) {
        this.isAbstime = isAbstime;
    }

    public int getTotalCoupon() {
        return totalCoupon;
    }

    public void setTotalCoupon(int totalCoupon) {
        this.totalCoupon = totalCoupon;
    }

    public String getGoodsSkuIds() {
        return goodsSkuIds;
    }

    public void setGoodsSkuIds(String goodsSkuIds) {
        this.goodsSkuIds = goodsSkuIds;
    }
}
