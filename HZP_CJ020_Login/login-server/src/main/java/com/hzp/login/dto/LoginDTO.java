package com.hzp.login.dto;

import java.util.Date;

/**
 * @Description: 封装页面显示的用户数据
 *
 * @author: Jerry
 *
 * @date: 2017/4/23
 */
public class LoginDTO
{
    /**
     * 用户编号
     */
    private String userNo;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户职业
     */
    private String profession;

    /**
     * 用户头像
     */
    private String head;

    /**
     * 第三方帐号
     */
    private String thirdAccount;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户出生日期
     */
    private Date birth;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 注册IP
     */
    private String regIp;

    /**
     * 最后一次登录IP
     */
    private String lastLoginIp;

    /**
     * 登录次数
     */
    private Long loginTimes;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取用户编号
     * @return userNo 用户编号
     */
    public String getUserNo()
    {
        return this.userNo;
    }

    /**
     * 设置用户编号
     * @param userNo 用户编号
     */
    public void setUserNo(String userNo)
    {
        this.userNo = userNo;
    }

    /**
     * 获取用户姓名
     * @return userName 用户姓名
     */
    public String getUserName()
    {
        return this.userName;
    }

    /**
     * 设置用户姓名
     * @param userName 用户姓名
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * 获取用户职业
     * @return profession 用户职业
     */
    public String getProfession()
    {
        return this.profession;
    }

    /**
     * 设置用户职业
     * @param profession 用户职业
     */
    public void setProfession(String profession)
    {
        this.profession = profession;
    }

    /**
     * 获取用户头像
     * @return head 用户头像
     */
    public String getHead()
    {
        return this.head;
    }

    /**
     * 设置用户头像
     * @param head 用户头像
     */
    public void setHead(String head)
    {
        this.head = head;
    }

    /**
     * 获取第三方帐号
     * @return thirdAccount 第三方帐号
     */
    public String getThirdAccount()
    {
        return this.thirdAccount;
    }

    /**
     * 设置第三方帐号
     * @param thirdAccount 第三方帐号
     */
    public void setThirdAccount(String thirdAccount)
    {
        this.thirdAccount = thirdAccount;
    }

    /**
     * 获取昵称
     * @return nickname 昵称
     */
    public String getNickname()
    {
        return this.nickname;
    }

    /**
     * 设置昵称
     * @param nickname 昵称
     */
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    /**
     * 获取用户性别
     * @return sex 用户性别
     */
    public String getSex()
    {
        return this.sex;
    }

    /**
     * 设置用户性别
     * @param sex 用户性别
     */
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    /**
     * 获取用户手机号
     * @return phone 用户手机号
     */
    public String getPhone()
    {
        return this.phone;
    }

    /**
     * 设置用户手机号
     * @param phone 用户手机号
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    /**
     * 获取用户出生日期
     * @return birth 用户出生日期
     */
    public Date getBirth()
    {
        return this.birth;
    }

    /**
     * 设置用户出生日期
     * @param birth 用户出生日期
     */
    public void setBirth(Date birth)
    {
        this.birth = birth;
    }

    /**
     * 获取用户地址
     * @return address 用户地址
     */
    public String getAddress()
    {
        return this.address;
    }

    /**
     * 设置用户地址
     * @param address 用户地址
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * 获取注册IP
     * @return regIp 注册IP
     */
    public String getRegIp()
    {
        return this.regIp;
    }

    /**
     * 设置注册IP
     * @param regIp 注册IP
     */
    public void setRegIp(String regIp)
    {
        this.regIp = regIp;
    }

    /**
     * 获取最后一次登录IP
     * @return lastLoginIp 最后一次登录IP
     */
    public String getLastLoginIp()
    {
        return this.lastLoginIp;
    }

    /**
     * 设置最后一次登录IP
     * @param lastLoginIp 最后一次登录IP
     */
    public void setLastLoginIp(String lastLoginIp)
    {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * 获取登录次数
     * @return loginTimes 登录次数
     */
    public Long getLoginTimes()
    {
        return this.loginTimes;
    }

    /**
     * 设置登录次数
     * @param loginTimes 登录次数
     */
    public void setLoginTimes(Long loginTimes)
    {
        this.loginTimes = loginTimes;
    }

    /**
     * 获取备注
     * @return remark 备注
     */
    public String getRemark()
    {
        return this.remark;
    }

    /**
     * 设置备注
     * @param remark 备注
     */
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
}
