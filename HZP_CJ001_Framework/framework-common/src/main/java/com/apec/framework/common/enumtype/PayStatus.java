/**
 * 
 */
package com.apec.framework.common.enumtype;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 支付状态
 * @author wjw 2016-11-26
 *
 */
@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum PayStatus
{
	NO_PAY("未支付"),PAY_OK("支付完成"),PAY_FAIL("支付失败"),PAY_DEPOSIT("已付压金");
	
	String name;
	PayStatus(String name)
    {
        this.name=name;
    }
	
	public String getName(){
		return name;
	}
}
