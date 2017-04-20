/**
 * 
 */
package com.hzp.framework.common.mall;

/**
 * 当日商品统计
 * @author wjw 2016-12-03
 *
 */
public class SkuCountDTO
{

    private Integer buyId;
    
    private Integer skuId;
    
    private Integer number;

    public Integer getSkuId()
    {
        return skuId;
    }

    public void setSkuId(Integer skuId)
    {
        this.skuId = skuId;
    }

    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

    public Integer getBuyId()
    {
        return buyId;
    }

    public void setBuyId(Integer buyId)
    {
        this.buyId = buyId;
    }
}
