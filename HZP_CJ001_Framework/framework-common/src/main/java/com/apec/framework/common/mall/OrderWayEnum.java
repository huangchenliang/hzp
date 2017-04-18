package com.apec.framework.common.mall;

/**
 * 类 编 号： 类 名 称： 内容摘要： 创建日期：2016-11-18 11:16 编码作者：zhaolei
 */
public enum OrderWayEnum {
	PHONE(1, "电话下单"), WEIXIN(2, "微信下单"), ANDROID(3, "Android下单"), IOS(4, "IOS下单");
	private int id;
	private String name;

	OrderWayEnum(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return id + "";
	}

	public static String getName(int id) {
		String content = "";
		for (OrderWayEnum starLevel : OrderWayEnum.values()) {
			if (id == starLevel.getId()) {
				content = starLevel.getName();
				break;
			}
		}
		return content;
	}

}
