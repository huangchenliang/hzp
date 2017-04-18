package com.apec.framework.common.mall;

import java.math.BigDecimal;

/**
 * 类 编 号：
 * 类 名 称：ShopCartVO
 * 内容摘要：购物车数据封装bean
 * 创建日期：2016/11/22
 * 编码作者：
 */
public class ShopCartVO
{
    /**
     * 买家ID
     */
    private Long buyId;

    /**
     * 商家ID
     */
    private Long saleId = 0L;

    /**
     * 客户城市代码
     */
    private Integer cityId;

    /**
     * 市场人员ID
     */
    private Long mId;

    /**
     * 市场人员名称
     */
    private String mName;

    /**
     * 客户名称
     */
    private String buyName;

    /**
     * 客户手机号
     */
    private String buyPhone;

    /**
     * 客户店铺名称
     */
    private String shopName;

    /**
     * 商品ID
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
     * 状态
     */
    private String status;

    private Integer platfromType;


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
     * 获取 商品ID
     */
    public Long getGoodsId()
    {
        return this.goodsId;
    }

    /**
     * 设置 商品ID
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

    /**
     * 获取 市场人员ID
     */
    public Long getMId()
    {
        return this.mId;
    }

    /**
     * 设置 市场人员ID
     */
    public void setMId(Long mId)
    {
        this.mId = mId;
    }

    /**
     * 获取 市场人员名称
     */
    public String getMName()
    {
        return this.mName;
    }

    /**
     * 设置 市场人员名称
     */
    public void setMName(String mName)
    {
        this.mName = mName;
    }

    /**
     * 获取 客户名称
     */
    public String getBuyName()
    {
        return this.buyName;
    }

    /**
     * 设置 客户名称
     */
    public void setBuyName(String buyName)
    {
        this.buyName = buyName;
    }

    /**
     * 获取 客户手机号
     */
    public String getBuyPhone()
    {
        return this.buyPhone;
    }

    /**
     * 设置 客户手机号
     */
    public void setBuyPhone(String buyPhone)
    {
        this.buyPhone = buyPhone;
    }

    /**
     * 获取 客户店铺名称
     */
    public String getShopName()
    {
        return this.shopName;
    }

    /**
     * 设置 客户店铺名称
     */
    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    /**
     * 获取 客户城市代码
     */
    public Integer getCityId()
    {
        return this.cityId;
    }

    /**
     * 设置 客户城市代码
     */
    public void setCityId(Integer cityId)
    {
        this.cityId = cityId;
    }

    /**
     * 获取 状态
     */
    public String getStatus()
    {
        return this.status;
    }

    /**
     * 设置 状态
     */
    public void setStatus(String status)
    {
        this.status = status;
    }

    public Integer getPlatfromType() {
        return platfromType;
    }

    public void setPlatfromType(Integer platfromType) {
        this.platfromType = platfromType;
    }
}
