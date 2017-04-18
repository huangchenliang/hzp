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
 * 创建日期：2017/3/29 16:11
 * 编码作者：zhaolei
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "query")
public class RoleQuery {
    @XmlElement(name = "id")
    private String id;
    @XmlElement(name = "event")
    private String event;
    @XmlElement(name = "entity")
    private String entity;
    @XmlElement(name = "roles")
    private Roles roles;
    @XmlElement(name = "params")
    private Params params;

    @XmlElement(name = "groupby")
    private String groupby;

    @XmlElement(name = "orderby")
    private Orderby orderby;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public String getGroupby() {
        return groupby;
    }

    public void setGroupby(String groupby) {
        this.groupby = groupby;
    }

    public Orderby getOrderby() {
        return orderby;
    }

    public void setOrderby(Orderby orderby) {
        this.orderby = orderby;
    }
}
