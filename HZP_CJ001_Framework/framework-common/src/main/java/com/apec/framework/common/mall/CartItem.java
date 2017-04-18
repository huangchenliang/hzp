package com.apec.framework.common.mall;

import java.math.BigDecimal;

/**
 * 类 编 号：
 * 类 名 称：CartItem
 * 内容摘要：购物车详情
 * 创建日期：2016/11/25
 * 编码作者：
 */
public class CartItem
{
    /**
     * 买家ID
     */
    private Long buyId;

    /**
     * 商家ID
     */
    private Long saleId;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 商家ID
     */
    private Long goodsId;

    /**
     * 商品名
     */
    private String goodsName;

    /**
     * SKU ID
     */
    private Long skuId;

    /**
     * SKU名称
     */
    private String skuName;

    /**
     * 商品单价
     */
    private BigDecimal price;

    /**
     * 购买数量
     */
    private Integer number;

    /**
     * 总价
     */
    private BigDecimal amount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取 买家ID
     */
    public Long getBuyId()
    {
        return this.buyId;
    }

    /**
     * 设置 买家ID
     */
    public void setBuyId(Long buyId)
    {
        this.buyId = buyId;
    }

    /**
     * 获取 商家ID
     */
    public Long getSaleId()
    {
        return this.saleId;
    }

    /**
     * 设置 商家ID
     */
    public void setSaleId(Long saleId)
    {
        this.saleId = saleId;
    }

    /**
     * 获取 店铺名称
     */
    public String getShopName()
    {
        return this.shopName;
    }

    /**
     * 设置 店铺名称
     */
    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    /**
     * 获取 商家ID
     */
    public Long getGoodsId()
    {
        return this.goodsId;
    }

    /**
     * 设置 商家ID
     */
    public void setGoodsId(Long goodsId)
    {
        this.goodsId = goodsId;
    }

    /**
     * 获取 商品名
     */
    public String getGoodsName()
    {
        return this.goodsName;
    }

    /**
     * 设置 商品名
     */
    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    /**
     * 获取 SKU ID
     */
    public Long getSkuId()
    {
        return this.skuId;
    }

    /**
     * 设置 SKU ID
     */
    public void setSkuId(Long skuId)
    {
        this.skuId = skuId;
    }

    /**
     * 获取 SKU名称
     */
    public String getSkuName()
    {
        return this.skuName;
    }

    /**
     * 设置 SKU名称
     */
    public void setSkuName(String skuName)
    {
        this.skuName = skuName;
    }

    /**
     * 获取 商品单价
     */
    public BigDecimal getPrice()
    {
        return this.price;
    }

    /**
     * 设置 商品单价
     */
    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    /**
     * 获取 购买数量
     */
    public Integer getNumber()
    {
        return this.number;
    }

    /**
     * 设置 购买数量
     */
    public void setNumber(Integer number)
    {
        this.number = number;
    }

    /**
     * 获取 总价
     */
    public BigDecimal getAmount()
    {
        return this.amount;
    }

    /**
     * 设置 总价
     */
    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    /**
     * 获取 备注
     */
    public String getRemark()
    {
        return this.remark;
    }

    /**
     * 设置 备注
     */
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
}
