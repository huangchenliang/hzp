package com.apec.framework.common.mall;

import java.io.Serializable;
import java.util.List;

public class GoodsSku implements Serializable
{

    private static final long serialVersionUID = -6282049759355519712L;

    private Integer goodsId;
    
    private String goodsName;
    
    private List<Sku> skuList;

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

    public List<Sku> getSkuList()
    {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList)
    {
        this.skuList = skuList;
    }

}
