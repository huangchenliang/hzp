package com.hzp.framework.common.mall;

import java.io.Serializable;
import java.math.BigDecimal;

import com.hzp.framework.common.enumtype.GoodsType;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Sku implements Serializable
{

    private static final long serialVersionUID = -1125960557737729322L;

    private Integer skuId;
    
    private String skuName;

    private Integer goodsId;

    private String goodsName;
    
    private GoodsType goodsType;

    private BigDecimal price;
    
    private Integer state;
    
    private WebSku cimsRelevanceVo;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



    public Integer getSkuId()
    {
        return skuId;
    }

    public void setSkuId(Integer skuId)
    {
        this.skuId = skuId;
    }

    public String getSkuName()
    {
        return skuName;
    }

    public void setSkuName(String skuName)
    {
        this.skuName = skuName;
    }

    public Integer getState()
    {
        return state;
    }

    public void setState(Integer state)
    {
        this.state = state;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
	public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}

	public WebSku getCimsRelevanceVo() {
		return cimsRelevanceVo;
	}

	public void setCimsRelevanceVo(WebSku cimsRelevanceVo) {
		this.cimsRelevanceVo = cimsRelevanceVo;
	}
}
