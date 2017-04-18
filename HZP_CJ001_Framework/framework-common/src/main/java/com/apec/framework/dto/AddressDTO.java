package com.apec.framework.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable
{
  
    private static final long serialVersionUID = 6355419126707266149L;

    private Integer buyId;
    
    private Long addrId;
    
    private String addrName;
    
    private String userName;
    
    private String userPhone;
    
    private Integer cityId;

    private AddressDetailVO addressDetail;

    public Long getAddrId()
    {
        return addrId;
    }

    public void setAddrId(Long addrId)
    {
        this.addrId = addrId;
    }

    public String getAddrName()
    {
        return addrName;
    }

    public void setAddrName(String addrName)
    {
        this.addrName = addrName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserPhone()
    {
        return userPhone;
    }

    public void setUserPhone(String userPhone)
    {
        this.userPhone = userPhone;
    }

    public Integer getCityId()
    {
        return cityId;
    }

    public void setCityId(Integer cityId)
    {
        this.cityId = cityId;
    }

    public Integer getBuyId()
    {
        return buyId;
    }

    public void setBuyId(Integer buyId)
    {
        this.buyId = buyId;
    }

    public AddressDetailVO getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(AddressDetailVO addressDetail) {
        this.addressDetail = addressDetail;
    }
}
