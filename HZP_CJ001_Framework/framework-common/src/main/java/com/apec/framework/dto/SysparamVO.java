package com.apec.framework.dto;


public class SysparamVO extends BaseDTO
{
    private Long id;
    
    private String oecdNo;

    private String paramType;

    private String name;

    private String value;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getOecdNo()
    {
        return oecdNo;
    }

    public void setOecdNo(String oecdNo)
    {
        this.oecdNo = oecdNo;
    }

    public String getParamType()
    {
        return paramType;
    }

    public void setParamType(String paramType)
    {
        this.paramType = paramType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
