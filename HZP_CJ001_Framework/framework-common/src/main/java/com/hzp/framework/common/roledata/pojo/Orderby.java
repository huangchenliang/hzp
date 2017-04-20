package com.hzp.framework.common.roledata.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/3/30 15:20
 * 编码作者：zhaolei
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "orderby")
public class Orderby {
    @XmlElement(name = "fields")
    private String fields;
    @XmlElement(name = "sort")
    private String sort;

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
