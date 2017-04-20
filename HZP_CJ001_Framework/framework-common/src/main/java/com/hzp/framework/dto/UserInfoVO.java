package com.hzp.framework.dto;


/**
 * 用户基本信息表model
 * @author zhangwenjia
 *
 */
public class UserInfoVO
{
    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    private String userNo;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户邮箱
     */
    private String userMail;

    /**
     * 用户手机号
     */
    private String userPhone;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户登录次数
     */
    private Integer userLogonNum;

    /**
     * 角色编号
     */
    private String userRoleNo;

    /**
     * 组织编号
     */
    private String userOecdNo;

    /**
     * 所属片区编号JSON
     */
    private String userAreaJson;

    /**
     * 所属部门编号
     */
    private String userDepartmentNo;

    /**
     * 直属上级编号
     */
    private String upUserNo;

    public String getUserNo()
    {
        return userNo;
    }

    public void setUserNo(String userNo)
    {
        this.userNo = userNo;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserMail()
    {
        return userMail;
    }

    public void setUserMail(String userMail)
    {
        this.userMail = userMail;
    }

    public String getUserPhone()
    {
        return userPhone;
    }

    public void setUserPhone(String userPhone)
    {
        this.userPhone = userPhone;
    }

    public String getUserPassword()
    {
        return userPassword;
    }

    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }

    public Integer getUserLogonNum()
    {
        return userLogonNum;
    }

    public void setUserLogonNum(Integer userLogonNum)
    {
        this.userLogonNum = userLogonNum;
    }

    public String getUserRoleNo()
    {
        return userRoleNo;
    }

    public void setUserRoleNo(String userRoleNo)
    {
        this.userRoleNo = userRoleNo;
    }

    public String getUserOecdNo()
    {
        return userOecdNo;
    }

    public void setUserOecdNo(String userOecdNo)
    {
        this.userOecdNo = userOecdNo;
    }

    public String getUserAreaJson()
    {
        return userAreaJson;
    }

    public void setUserAreaJson(String userAreaJson)
    {
        this.userAreaJson = userAreaJson;
    }

    public String getUserDepartmentNo()
    {
        return userDepartmentNo;
    }

    public void setUserDepartmentNo(String userDepartmentNo)
    {
        this.userDepartmentNo = userDepartmentNo;
    }

    public String getUpUserNo()
    {
        return upUserNo;
    }

    public void setUpUserNo(String upUserNo)
    {
        this.upUserNo = upUserNo;
    }

}
