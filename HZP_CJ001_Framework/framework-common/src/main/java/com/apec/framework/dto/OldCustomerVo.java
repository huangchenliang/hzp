package com.apec.framework.dto;

import java.util.List;

public class OldCustomerVo
{
    private int userId;
    
    private String userName;
    
    private String shopName;
    
    private String marketerName;
    
    private String marketerId;
    
    private List<ConsigneeVo> list;

    public String getMarketerId()
    {
        return marketerId;
    }

    public void setMarketerId(String marketerId)
    {
        this.marketerId = marketerId;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getShopName()
    {
        return shopName;
    }

    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    public String getMarketerName()
    {
        return marketerName;
    }

    public void setMarketerName(String marketerName)
    {
        this.marketerName = marketerName;
    }

    public List<ConsigneeVo> getList()
    {
        return list;
    }

    public void setList(List<ConsigneeVo> list)
    {
        this.list = list;
    }
    
}
