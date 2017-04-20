package com.hzp.framework.common.mall;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-12-29 11:24
 * 编码作者：zhaolei
 */
public class BuyLimitDTO {
    private Sku sku;
    private int limitCount;

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public int getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(int limitCount) {
        this.limitCount = limitCount;
    }
}
