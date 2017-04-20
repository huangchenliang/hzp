package com.hzp.framework.dto;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-10-28 16:59
 * 编码作者：zhaolei
 */
public class ImageDTO2 {
    private String originalUrl;
    private String originaPath;
    private String thumbnailUrl;
    private String thumbnailPath;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getOriginaPath() {
        return originaPath;
    }

    public void setOriginaPath(String originaPath) {
        this.originaPath = originaPath;
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath;
    }
}
