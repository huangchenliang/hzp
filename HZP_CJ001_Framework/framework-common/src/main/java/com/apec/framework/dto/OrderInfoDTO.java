package com.apec.framework.dto;

import com.apec.framework.common.enumtype.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderInfoDTO extends BaseDTO
{
    private String orderNo;

    private Long id;

    private Long userId;

    private Long parentOrderId;
    
    private String saleName;
    
    private String userName;
    
    private String userPhone;
    
    private OrderWay orderWay;
    
    private OrderStatus orderState;
    
    private Date oderTime;
    
    private BigDecimal originalOrderAmount;
    
    private BigDecimal orderAmount;
    
    private BigDecimal taxes;
    
    private BigDecimal logisticsCost;
    
    private BigDecimal discountCut;
    
    private String discountId;
    
    private BigDecimal couponCut;
    
    private String couponId;
    
    private Integer cityId;
    
    private LgsStatus logisticsState;
    
    private PayStatus payStatus;
    
    private PayWay payWay;
    
    private Date payTime;
    
    private String remark;
    
    private String checkUserId;
    
    private Date checkTime;
    
    private List<OrderDetailDTO>goodsList;
    
    private Date startTime; 
    
    private Date endTime;
    
    private Integer buyId;
    
    private Integer saleId;

    private Date sendTime;
    private Date recvTime;

    private String addrName;
    private String shopName;

    /**
     * 第三方支付流水
     */
    private String payRef;
    private PickWay pickWay;
    private String lastUpdateBy;
    
    private Integer marketerId;
    
    @Deprecated
    private OrderStatus orderStatus;
    
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName;
    }
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
    public List<OrderDetailDTO> getGoodsList()
    {
        return goodsList;
    }
    public void setGoodsList(List<OrderDetailDTO> goodsList)
    {
        this.goodsList = goodsList;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getStartTime()
    {
        return startTime;
    }
    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }
    public Date getEndTime()
    {
        return endTime;
    }
    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }
    public Integer getBuyId()
    {
        return buyId;
    }
    public void setBuyId(Integer buyId)
    {
        this.buyId = buyId;
    }
    public Integer getSaleId()
    {
        return saleId;
    }
    public void setSaleId(Integer saleId)
    {
        this.saleId = saleId;
    }
    public String getOrderNo()
    {
        return orderNo;
    }
    public void setOrderNo(String orderNo)
    {
        this.orderNo = orderNo;
    }
    public Long getParentOrderId()
    {
        return parentOrderId;
    }
    public void setParentOrderId(Long parentOrderId)
    {
        this.parentOrderId = parentOrderId;
    }
    public String getSaleName()
    {
        return saleName;
    }
    public void setSaleName(String saleName)
    {
        this.saleName = saleName;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getUserPhone()
    {
        return userPhone;
    }
    public void setUserPhone(String userPhone)
    {
        this.userPhone = userPhone;
    }
    public OrderWay getOrderWay()
    {
        return orderWay;
    }
    public void setOrderWay(OrderWay orderWay)
    {
        this.orderWay = orderWay;
    }
    public OrderStatus getOrderState()
    {
        return orderState;
    }
    public void setOrderState(OrderStatus orderState)
    {
        this.orderState = orderState;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getOderTime()
    {
        return oderTime;
    }
    public void setOderTime(Date oderTime)
    {
        this.oderTime = oderTime;
    }
    public String getCheckUserId()
    {
        return checkUserId;
    }
    public void setCheckUserId(String checkUserId)
    {
        this.checkUserId = checkUserId;
    }
    public Date getCheckTime()
    {
        return checkTime;
    }
    public void setCheckTime(Date checkTime)
    {
        this.checkTime = checkTime;
    }
    public BigDecimal getOrderAmount()
    {
        return orderAmount;
    }
    public void setOrderAmount(BigDecimal orderAmount)
    {
        this.orderAmount = orderAmount;
    }
    public BigDecimal getOriginalOrderAmount()
    {
        return originalOrderAmount;
    }
    public void setOriginalOrderAmount(BigDecimal originalOrderAmount)
    {
        this.originalOrderAmount = originalOrderAmount;
    }
    public BigDecimal getTaxes()
    {
        return taxes;
    }
    public void setTaxes(BigDecimal taxes)
    {
        this.taxes = taxes;
    }
    public BigDecimal getLogisticsCost()
    {
        return logisticsCost;
    }
    public void setLogisticsCost(BigDecimal logisticsCost)
    {
        this.logisticsCost = logisticsCost;
    }
    public BigDecimal getDiscountCut()
    {
        return discountCut;
    }
    public void setDiscountCut(BigDecimal discountCut)
    {
        this.discountCut = discountCut;
    }
    public String getDiscountId()
    {
        return discountId;
    }
    public void setDiscountId(String discountId)
    {
        this.discountId = discountId;
    }
    public BigDecimal getCouponCut()
    {
        return couponCut;
    }
    public void setCouponCut(BigDecimal couponCut)
    {
        this.couponCut = couponCut;
    }
    public String getCouponId()
    {
        return couponId;
    }
    public void setCouponId(String couponId)
    {
        this.couponId = couponId;
    }
    public Integer getCityId()
    {
        return cityId;
    }
    public void setCityId(Integer cityId)
    {
        this.cityId = cityId;
    }
    public LgsStatus getLogisticsState()
    {
        return logisticsState;
    }
    public void setLogisticsState(LgsStatus logisticsState)
    {
        this.logisticsState = logisticsState;
    }
    public PayStatus getPayStatus()
    {
        return payStatus;
    }
    public void setPayStatus(PayStatus payStatus)
    {
        this.payStatus = payStatus;
    }
    public PayWay getPayWay()
    {
        return payWay;
    }
    public void setPayWay(PayWay payWay)
    {
        this.payWay = payWay;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getPayTime()
    {
        return payTime;
    }
    public void setPayTime(Date payTime)
    {
        this.payTime = payTime;
    }
    public String getRemark()
    {
        return remark;
    }
    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long orderId) {
        this.id = orderId;
    }

    /**
     * 获取 第三方支付流水
     */
    public String getPayRef()
    {
        return this.payRef;
    }

    /**
     * 设置 第三方支付流水
     */
    public void setPayRef(String payRef)
    {
        this.payRef = payRef;
    }

    public Long getUserId()
    {
        return this.userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public PickWay getPickWay()
    {
        return pickWay;
    }

    public void setPickWay(PickWay pickWay)
    {
        this.pickWay = pickWay;
    }

    public String getLastUpdateBy()
    {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy)
    {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getRecvTime()
    {
        return recvTime;
    }

    public void setRecvTime(Date recvTime)
    {
        this.recvTime = recvTime;
    }

    public Integer getMarketerId()
    {
        return marketerId;
    }

    public void setMarketerId(Integer marketerId)
    {
        this.marketerId = marketerId;
    }

    @Deprecated
    public OrderStatus getOrderStatus()
    {
        return orderStatus;
    }

    @Deprecated
    public void setOrderStatus(OrderStatus orderStatus)
    {
        this.orderStatus = orderStatus;
    }
}
