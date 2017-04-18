package com.apec.framework.dto;

public class SystemUpgradeVO extends BaseDTO
{
private String osType;

    private Long id;
    
    /**
     * 系统当前版本号
     */
    private String maxVersion;
    
    /**
     * 系统支持最低版本号
     */
    private String minVersion;
    
    /**
     * 更新URL
     */
    private String upgradeUrl;
    
    /**
     * 更新描述
     */
    private String upgradeDesc;
    
    /**
     * 更新标题
     */
    private String title;
    
    /**
     * IOS审核版本号
     */
    private String reviewVersion;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getOsType()
    {
        return osType;
    }

    public void setOsType(String osType)
    {
        this.osType = osType;
    }

    public String getMaxVersion()
    {
        return maxVersion;
    }

    public void setMaxVersion(String maxVersion)
    {
        this.maxVersion = maxVersion;
    }

    public String getMinVersion()
    {
        return minVersion;
    }

    public void setMinVersion(String minVersion)
    {
        this.minVersion = minVersion;
    }

    public String getUpgradeUrl()
    {
        return upgradeUrl;
    }

    public void setUpgradeUrl(String upgradeUrl)
    {
        this.upgradeUrl = upgradeUrl;
    }

    public String getUpgradeDesc()
    {
        return upgradeDesc;
    }

    public void setUpgradeDesc(String upgradeDesc)
    {
        this.upgradeDesc = upgradeDesc;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getReviewVersion()
    {
        return reviewVersion;
    }

    public void setReviewVersion(String reviewVersion)
    {
        this.reviewVersion = reviewVersion;
    }
}
