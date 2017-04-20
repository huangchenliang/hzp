package com.hzp.framework.common.mall;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CouponRuleBo
{
    private Long id;
    
    private Integer userLevel;
    
    private Date finalEndDate;
    
    private Integer validDays;    
    
    private String goodsSkuJson;
    
    private String goodsSkuIds;
    
    private List<GoodsSku> GoodsList ;
    
    private Integer ownWay;
    
    private String payWay;
    
    private List<Integer> payWayList;
    
    private BigDecimal minAmount;
    
    private String orderWay;
    
    private List<Integer> orderWayList;
    
    private String couponName;
    
    private String allGoods;
    
    private BigDecimal couponAmount;
    
    private String isAbstime;

    public Integer getUserLevel()
    {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel)
    {
        this.userLevel = userLevel;
    }

    public Date getFinalEndDate()
    {
        return finalEndDate;
    }

    public void setFinalEndDate(Date finalEndDate)
    {
        this.finalEndDate = finalEndDate;
    }

    public List<GoodsSku> getGoodsList()
    {
        return GoodsList;
    }

    public void setGoodsList(List<GoodsSku> goodsList)
    {
        GoodsList = goodsList;
    }

    public Integer getValidDays()
    {
        return validDays;
    }

    public void setValidDays(Integer validDays)
    {
        this.validDays = validDays;
    }

    public Integer getOwnWay()
    {
        return ownWay;
    }

    public void setOwnWay(Integer ownWay)
    {
        this.ownWay = ownWay;
    }

    public BigDecimal getMinAmount()
    {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount)
    {
        this.minAmount = minAmount;
    }


    public String getCouponName()
    {
        return couponName;
    }

    public void setCouponName(String couponName)
    {
        this.couponName = couponName;
    }

    public BigDecimal getCouponAmount()
    {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount)
    {
        this.couponAmount = couponAmount;
    }

    public String getIsAbstime()
    {
        return isAbstime;
    }

    public void setIsAbstime(String isAbstime)
    {
        this.isAbstime = isAbstime;
    }

    public String getOrderWay()
    {
        return orderWay;
    }

    public void setOrderWay(String orderWay)
    {
        this.orderWay = orderWay;
    }

    public List<Integer> getOrderWayList()
    {
        return orderWayList;
    }

    public void setOrderWayList(List<Integer> orderWayList)
    {
        this.orderWayList = orderWayList;
    }

    public String getPayWay()
    {
        return payWay;
    }

    public void setPayWay(String payWay)
    {
        this.payWay = payWay;
    }

    public List<Integer> getPayWayList()
    {
        return payWayList;
    }

    public void setPayWayList(List<Integer> payWayList)
    {
        this.payWayList = payWayList;
    }

    @JsonIgnore
    public String getGoodsSkuJson()
    {
        return goodsSkuJson;
    }

    public void setGoodsSkuJson(String goodsSkuJson)
    {
        this.goodsSkuJson = goodsSkuJson;
    }

    public String getAllGoods()
    {
        return allGoods;
    }

    public void setAllGoods(String allGoods)
    {
        this.allGoods = allGoods;
    }

    public String getGoodsSkuIds()
    {
        return goodsSkuIds;
    }

    public void setGoodsSkuIds(String goodsSkuIds)
    {
        this.goodsSkuIds = goodsSkuIds;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

}
