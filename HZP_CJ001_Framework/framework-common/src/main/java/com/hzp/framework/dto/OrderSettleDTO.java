package com.hzp.framework.dto;

import com.hzp.framework.common.mall.CouponDTO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 结算结果
 * @author wjw 2016/11/21
 *
 */
public class OrderSettleDTO implements Serializable
{

    private static final long serialVersionUID = 6268143512159137381L;
    
    private Integer buyId;
    
    private List<CouponDTO> couponList;
    
    private BigDecimal amount=new BigDecimal(0);
    
    private BigDecimal actualAmount=new BigDecimal(0);
    
    private BigDecimal discountCut=new BigDecimal(0);
    
    private BigDecimal couponCut=new BigDecimal(0);
    
    private BigDecimal taxAddon=new BigDecimal(0);
    
    private BigDecimal lgsAddon=new BigDecimal(0);

    public Integer getBuyId()
    {
        return buyId;
    }

    public void setBuyId(Integer buyId)
    {
        this.buyId = buyId;
    }

    public List<CouponDTO> getCouponList()
    {
        return couponList;
    }

    public void setCouponList(List<CouponDTO> couponList)
    {
        this.couponList = couponList;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public BigDecimal getDiscountCut()
    {
        return discountCut;
    }

    public void setDiscountCut(BigDecimal discountCut)
    {
        this.discountCut = discountCut;
    }

    public BigDecimal getCouponCut()
    {
        return couponCut;
    }

    public void setCouponCut(BigDecimal couponCut)
    {
        this.couponCut = couponCut;
    }

    public BigDecimal getActualAmount()
    {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount)
    {
        this.actualAmount = actualAmount;
    }

    public BigDecimal getTaxAddon()
    {
        return taxAddon;
    }

    public void setTaxAddon(BigDecimal taxAddon)
    {
        this.taxAddon = taxAddon;
    }

    public BigDecimal getLgsAddon()
    {
        return lgsAddon;
    }

    public void setLgsAddon(BigDecimal lgsAddon)
    {
        this.lgsAddon = lgsAddon;
    }
}
