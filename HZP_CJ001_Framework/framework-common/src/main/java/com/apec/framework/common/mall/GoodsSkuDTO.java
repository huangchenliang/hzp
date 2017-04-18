package com.apec.framework.common.mall;

import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-11-18 10:51
 * 编码作者：zhaolei
 */
public class GoodsSkuDTO {
    private int goodsId;
    private String goodsName;
    private List<SkuDTO> skuList;

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public List<SkuDTO> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<SkuDTO> skuList) {
        this.skuList = skuList;
    }
}
