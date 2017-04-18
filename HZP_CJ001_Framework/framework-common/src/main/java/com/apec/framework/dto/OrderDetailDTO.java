/**
 * 
 */
package com.apec.framework.dto;

import java.math.BigDecimal;

import com.apec.framework.dto.BaseDTO;

/**
 * @author wjw 2016-11-29
 *
 */
public class OrderDetailDTO extends BaseDTO
{

    private Long orderId;
    
    private Integer skuId;
    
    private String skuName;
    
    private Integer goodsId;


    private String goodsName;
    
    private Integer cutNumber;
    
    private BigDecimal amount=new BigDecimal(0);
    
    private BigDecimal discountCut;
    private BigDecimal price=new BigDecimal(0);
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    
    private String remark;
    private Integer number=0;
    private Integer rmaNumber=0;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public Integer getRmaNumber() {
        return rmaNumber;
    }

    public void setRmaNumber(Integer rmaNumber) {
        this.rmaNumber = rmaNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }



    public Long getOrderId()
    {
        return orderId;
    }

    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }

    public Integer getSkuId()
    {
        return skuId;
    }

    public void setSkuId(Integer skuId)
    {
        this.skuId = skuId;
    }

    public Integer getCutNumber()
    {
        return cutNumber;
    }

    public void setCutNumber(Integer cutNumber)
    {
        this.cutNumber = cutNumber;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public String getSkuName()
    {
        return skuName;
    }

    public void setSkuName(String skuName)
    {
        this.skuName = skuName;
    }

    public Integer getGoodsId()
    {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId)
    {
        this.goodsId = goodsId;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
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
}
