package com.hzp.framework.dto;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/2/14 15:05
 * 编码作者：zhaolei
 */
public class DiscountRuleDTO {
    private long id;
    private String discountName;

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
