package com.apec.framework.common.roledata.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/3/29 16:45
 * 编码作者：zhaolei
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "querys")
public class RoleQuerys {
    @XmlElement(name = "query")
    List<RoleQuery> querys;

    public List<RoleQuery> getQuerys() {
        return querys;
    }

    public void setQuerys(List<RoleQuery> querys) {
        this.querys = querys;
    }
}
