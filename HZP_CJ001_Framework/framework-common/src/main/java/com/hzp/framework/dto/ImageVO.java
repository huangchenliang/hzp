package com.hzp.framework.dto;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-10-28 9:23
 * 编码作者：zhaolei
 */
public class ImageVO {
    private String entityNo;
    private String imgName;
    private String imgPath;
    private Integer sizeLevel;
    private Integer imgIndex;
    private String userNo;

    public String getEntityNo() {
        return entityNo;
    }

    public void setEntityNo(String entityNo) {
        this.entityNo = entityNo;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getSizeLevel() {
        return sizeLevel;
    }

    public void setSizeLevel(Integer sizeLevel) {
        this.sizeLevel = sizeLevel;
    }

    public Integer getImgIndex() {
        return imgIndex;
    }

    public void setImgIndex(Integer imgIndex) {
        this.imgIndex = imgIndex;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}
