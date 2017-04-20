package com.hzp.framework.common.mall;

import java.io.Serializable;
import java.util.Date;


public class CouponDTO implements Serializable
{
 
    private static final long serialVersionUID = 5992472119724055528L;

    private Integer buyId;
    
    private Integer saleId;
    
    private Long id;
    
    private Date ownTime;
    
    private Integer ownWay;
    
    private CouponRuleBo couponRule;
    
    private Date startDate;
    
    private Date endDate;

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

    public Date getOwnTime()
    {
        return ownTime;
    }

    public void setOwnTime(Date ownTime)
    {
        this.ownTime = ownTime;
    }

    public Integer getOwnWay()
    {
        return ownWay;
    }

    public void setOwnWay(Integer ownWay)
    {
        this.ownWay = ownWay;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public CouponRuleBo getCouponRule()
    {
        return couponRule;
    }

    public void setCouponRule(CouponRuleBo couponRule)
    {
        this.couponRule = couponRule;
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
