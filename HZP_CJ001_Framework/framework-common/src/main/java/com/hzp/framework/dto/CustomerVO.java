package com.hzp.framework.dto;

import java.util.List;

/**
 * 类 编 号：客户信息数据传输对象
 * 类 名 称：CustomerVO
 * 内容摘要：
 * 完成日期：
 * 编码作者：
 */
public class CustomerVO
{

    private String id; //set进去的是customer

    /**
     * 用户编号
     */
    private String userNo;

    /**
     * 客户编号
     */
    private String customerNo;

    private String customerName;

    private String customerType;

    private String customerLevel;

    private String customerState;

    private String businessHours;

    private String source;

    private String areaNo;

    private String isSpeedInto;

    private String classId;

    /**
     * 省
     */
    private String provinceId;

    /**
     * 市
     */
    private String cityId;

    /**
     * 区
     */
    private String areaId;

    private AddressVo address;

    private List<ContactVO> contacts;

    /**
     * 仅供页面使用
     *  1:私海客户，2:公海客户
     */
    private int type;

    /**
     * 客户编号集合
     */
    List<String> customerNOList;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerType()
    {
        return customerType;
    }

    public void setCustomerType(String customerType)
    {
        this.customerType = customerType;
    }

    public String getCustomerLevel()
    {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel)
    {
        this.customerLevel = customerLevel;
    }

    public String getCustomerState()
    {
        return customerState;
    }

    public void setCustomerState(String customerState)
    {
        this.customerState = customerState;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public String getAreaNo()
    {
        return areaNo;
    }

    public void setAreaNo(String areaNo)
    {
        this.areaNo = areaNo;
    }

    public String getIsSpeedInto()
    {
        return isSpeedInto;
    }

    public void setIsSpeedInto(String isSpeedInto)
    {
        this.isSpeedInto = isSpeedInto;
    }

    public String getClassId()
    {
        return classId;
    }

    public void setClassId(String classId)
    {
        this.classId = classId;
    }

    public AddressVo getAddress()
    {
        return address;
    }

    public void setAddress(AddressVo address)
    {
        this.address = address;
    }

    public List<ContactVO> getContacts()
    {
        return contacts;
    }

    public void setContacts(List<ContactVO> contacts)
    {
        this.contacts = contacts;
    }

    public String getBusinessHours()
    {
        return businessHours;
    }

    public void setBusinessHours(String businessHours)
    {
        this.businessHours = businessHours;
    }

    /**
     * 获取 客户编号
     */
    public String getCustomerNo()
    {
        return this.customerNo;
    }

    /**
     * 设置 客户编号
     */
    public void setCustomerNo(String customerNo)
    {
        this.customerNo = customerNo;
    }

    /**
     * 获取 省
     */
    public String getProvinceId()
    {
        return this.provinceId;
    }

    /**
     * 设置 省
     */
    public void setProvinceId(String provinceId)
    {
        this.provinceId = provinceId;
    }

    /**
     * 获取 市
     */
    public String getCityId()
    {
        return this.cityId;
    }

    /**
     * 设置 市
     */
    public void setCityId(String cityId)
    {
        this.cityId = cityId;
    }

    /**
     * 获取 区
     */
    public String getAreaId()
    {
        return this.areaId;
    }

    /**
     * 设置 区
     */
    public void setAreaId(String areaId)
    {
        this.areaId = areaId;
    }

    /**
     * 仅供页面使用
     *  1:私海客户，2:公海客户
     */
    public int getType()
    {
        return this.type;
    }

    /**
     * 仅供页面使用
     *  1:私海客户，2:公海客户
     */
    public void setType(int type)
    {
        this.type = type;
    }

    /**
     * 获取 客户编号集合
     */
    public List<String> getCustomerNOList()
    {
        return this.customerNOList;
    }

    /**
     * 设置 客户编号集合
     */
    public void setCustomerNOList(List<String> customerNOList)
    {
        this.customerNOList = customerNOList;
    }

    /**
     * 获取 用户编号
     */
    public String getUserNo() {
        return this.userNo;
    }

    /**
     * 设置 用户编号
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}
