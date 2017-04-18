package com.apec.framework.common.mall;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：ShopCartDTO
 * 内容摘要：返回前端购物车信息数据封装
 * 创建日期：2016/11/25
 * 编码作者：
 */
public class ShopCartDTO
{
    /**
     * 商家ID
     */
    private Long saleId;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 总的价格
     */
    private BigDecimal totalPrice;

    /**
     * 客户名称
     */
    private String buyName;

    /**
     * 客户电话
     */
    private String buyPhone;

    /**
     * 每个商家下来的商品信息
     */
    List<CartItem> items;

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
     * 获取 每个商家下来的商品信息
     */
    public List<CartItem> getItems()
    {
        return this.items;
    }

    /**
     * 设置 每个商家下来的商品信息
     */
    public void setItems(List<CartItem> items)
    {
        this.items = items;
    }

    /**
     * 获取 总的价格
     */
    public BigDecimal getTotalPrice()
    {
        return this.totalPrice;
    }

    /**
     * 设置 总的价格
     */
    public void setTotalPrice(BigDecimal totalPrice)
    {
        this.totalPrice = totalPrice;
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
     * 获取 客户电话
     */
    public String getBuyPhone()
    {
        return this.buyPhone;
    }

    /**
     * 设置 客户电话
     */
    public void setBuyPhone(String buyPhone)
    {
        this.buyPhone = buyPhone;
    }
}
