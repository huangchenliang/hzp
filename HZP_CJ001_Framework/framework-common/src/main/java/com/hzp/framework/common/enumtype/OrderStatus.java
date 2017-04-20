package com.hzp.framework.common.enumtype;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 订单状态
 * @author wjw 2016-11-26
 *
 */
@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum OrderStatus
{

    STATUS_NONE("所有状态"),
    STATUS_WAITING("等待处理"),
    STATUS_ONGOING("处理中"),
    STATUS_FINISH("已完成"),
    STATUS_CANCEL("已取消"),
    STATUS_NOPAY("未付款");
    OrderStatus(String name)
    {
        this.name=name;
    }
    String name;
    
    public String getName()
    {
        return name;
    }
}
