package com.hzp.framework.dto;

public class ConsigneeVo
{
    private int consigneeId;
    
    private String consigneeName;
    
    private String consigneePhone;
    
    private String consigneeAddress;
    
    private int cityId;
    
    public int getCityId()
    {
        return cityId;
    }

    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }

    public int getConsigneeId()
    {
        return consigneeId;
    }

    public void setConsigneeId(int consigneeId)
    {
        this.consigneeId = consigneeId;
    }

    public String getConsigneeName()
    {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName)
    {
        this.consigneeName = consigneeName;
    }

    public String getConsigneePhone()
    {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone)
    {
        this.consigneePhone = consigneePhone;
    }

    public String getConsigneeAddress()
    {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress)
    {
        this.consigneeAddress = consigneeAddress;
    }
    
}
