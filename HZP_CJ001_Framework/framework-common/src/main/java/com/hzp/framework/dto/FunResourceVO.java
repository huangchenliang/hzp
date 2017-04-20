package com.hzp.framework.dto;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-10-12 9:43
 * 编码作者：zhaolei
 */
public class FunResourceVO {
    private int id;
    private String resNo;
    private String resDesc;
    private String resType;
    private String resUrl;
    private String resParentNo;
    private String path;
    private Integer resOrder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResNo() {
        return resNo;
    }

    public void setResNo(String resNo) {
        this.resNo = resNo;
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }

    public String getResParentNo() {
        return resParentNo;
    }

    public void setResParentNo(String resParentNo) {
        this.resParentNo = resParentNo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getResOrder() {
        return resOrder;
    }

    public void setResOrder(Integer resOrder) {
        this.resOrder = resOrder;
    }
}
