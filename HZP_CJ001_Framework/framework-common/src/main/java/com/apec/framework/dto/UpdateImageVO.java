package com.apec.framework.dto;

import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-11-04 16:04
 * 编码作者：zhaolei
 */
public class UpdateImageVO {
    String entityNo;
    String userNo;
    List<ImageVO> list;

    public String getEntityNo() {
        return entityNo;
    }

    public void setEntityNo(String entityNo) {
        this.entityNo = entityNo;
    }

    public List<ImageVO> getList() {
        return list;
    }

    public void setList(List<ImageVO> list) {
        this.list = list;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}
