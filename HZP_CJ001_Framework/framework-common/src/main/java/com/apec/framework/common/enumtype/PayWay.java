package com.apec.framework.common.enumtype;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum PayWay
{
    
    PAY_NONE("所有支付"),
    PAY_COD("货到付款"),
    PAY_WEIXIN("微信支付"),
    PAY_ALI("支付宝"),
    PAY_BANK("银行卡");
	
	String name;
	PayWay(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
}
