package com.hzp.framework.common.enumtype;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 下单方式
 * @author wjw 2016-11-26
 *
 */
@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum OrderWay
{
    ORDER_NONE,ORDER_PHONE,ORDER_WEIXIN,ORDER_ANDROI,ORDER_IOS;
}
