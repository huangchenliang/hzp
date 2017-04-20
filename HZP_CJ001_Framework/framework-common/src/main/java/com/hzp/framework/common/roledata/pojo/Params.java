package com.hzp.framework.common.roledata.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/3/29 17:23
 * 编码作者：zhaolei
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "params")
public class Params {
    @XmlElement(name = "param")
    private List<Param> params;

    public List<Param> getParams() {
        return params;
    }

    public void setParams(List<Param> params) {
        this.params = params;
    }
}
