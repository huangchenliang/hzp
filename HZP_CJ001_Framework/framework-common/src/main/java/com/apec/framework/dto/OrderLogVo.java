package com.apec.framework.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.apec.framework.common.enumtype.LgsStatus;
import com.apec.framework.common.enumtype.OrderStatus;
import com.apec.framework.common.enumtype.PayStatus;
import com.apec.framework.common.enumtype.RmaStatus;
import com.fasterxml.jackson.annotation.JsonFormat;



public class OrderLogVo
{
    private Long orderId;
    
    private String orderNo;
    
    private String opsVerb;
    
    private String userId;
    
    private String userName;
    
    private Integer cityId=100;
    
    private Long orderNumber;
    
    private BigDecimal orderAmount;

    private OrderStatus orderStatus=OrderStatus.STATUS_WAITING;
    
    private LgsStatus lgsStatus=LgsStatus.LGS_DEFAULT;
    
    private PayStatus payStatus=PayStatus.NO_PAY;
    
    private RmaStatus rmaStatus=RmaStatus.NORMAL;
    
    
    private Date createDate;
    
    private String logText;

    public Long getOrderId()
    {
        return orderId;
    }

    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }

    public String getOrderNo()
    {
        return orderNo;
    }

    public void setOrderNo(String orderNo)
    {
        this.orderNo = orderNo;
    }

    public String getOpsVerb()
    {
        return opsVerb;
    }

    public void setOpsVerb(String opsVerb)
    {
        this.opsVerb = opsVerb;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public Integer getCityId()
    {
        return cityId;
    }

    public void setCityId(Integer cityId)
    {
        this.cityId = cityId;
    }

    public Long getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getOrderAmount()
    {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount)
    {
        this.orderAmount = orderAmount;
    }

    public OrderStatus getOrderStatus()
    {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus)
    {
        this.orderStatus = orderStatus;
    }

    public LgsStatus getLgsStatus()
    {
        return lgsStatus;
    }

    public void setLgsStatus(LgsStatus lgsStatus)
    {
        this.lgsStatus = lgsStatus;
    }

    public PayStatus getPayStatus()
    {
        return payStatus;
    }

    public void setPayStatus(PayStatus payStatus)
    {
        this.payStatus = payStatus;
    }

    public RmaStatus getRmaStatus()
    {
        return rmaStatus;
    }

    public void setRmaStatus(RmaStatus rmaStatus)
    {
        this.rmaStatus = rmaStatus;
    }

    public String getLogText()
    {
        return logText;
    }

    public void setLogText(String logText)
    {
        this.logText = logText;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }
}
