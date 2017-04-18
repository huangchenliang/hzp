package com.apec.framework.dto;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-12-11 11:03
 * 编码作者：zhaolei
 */
public class AddressDetailVO {
    private RegionVO province;
    private RegionVO city;
    private RegionVO area;
    private RegionVO street;

    public RegionVO getProvince() {
        return province;
    }

    public void setProvince(RegionVO province) {
        this.province = province;
    }

    public RegionVO getCity() {
        return city;
    }

    public void setCity(RegionVO city) {
        this.city = city;
    }

    public RegionVO getArea() {
        return area;
    }

    public void setArea(RegionVO area) {
        this.area = area;
    }

    public RegionVO getStreet() {
        return street;
    }

    public void setStreet(RegionVO street) {
        this.street = street;
    }
}
