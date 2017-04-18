package com.apec.framework.common.roledata.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/3/29 16:15
 * 编码作者：zhaolei
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "param")
public class Param {
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "operator")
    private String operator;

    @XmlAttribute(name = "logical")
    private String logical;
    @XmlValue
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLogical() {
        return logical;
    }

    public void setLogical(String logical) {
        this.logical = logical;
    }
}
