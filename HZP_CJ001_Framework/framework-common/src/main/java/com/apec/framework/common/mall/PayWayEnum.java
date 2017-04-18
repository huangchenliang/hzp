package com.apec.framework.common.mall;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-11-18 11:17
 * 编码作者：zhaolei
 */
public enum PayWayEnum {
    PAYMENT(1,"线下支付"),ONLINE_BANK(2,"网银"),WEIXIN(3,"微信支付"),ALIPAY(4,"支付宝");
    private int id;
    private String name;

    PayWayEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
		return id;
	}
    
	public String getName() {
		return name;
	}
	
    @Override
    public String toString() {
        return id+"";
    }
	public static String getName(Integer id) {
		String content = "";
		for(PayWayEnum starLevel:PayWayEnum.values()) { 
			if (id== starLevel.getId()) {
				content = starLevel.getName();
			 	break;
			}			
		}
		return content;	
	}
}
