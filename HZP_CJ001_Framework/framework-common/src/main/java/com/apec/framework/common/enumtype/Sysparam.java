package com.apec.framework.common.enumtype;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-09-28 11:49
 * 编码作者：zhaolei
 */
public enum Sysparam {
	CUSTOMER_TYPE("type", "客户类型"),
	CLASS("classes", "销售品类"),
	CUSTOMER_STATE("state", "客户状态"),
	SOURCE("source", "客户来源"),
	CUSTOMER_LEVEL("level", "客户分类");
	
	private String name;
	private String content;
	
	Sysparam(String name, String content) {
		this.name = name;
		this.content = content;
	}
	
	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}

	public static String getName(String id) {
		String content = "";
		for(Sysparam starLevel:Sysparam.values()) { 
			if (id.equals(starLevel.getClass())) {
				content = starLevel.getContent();
			 	break;
			}			
		}
		return content;	
	}
}
