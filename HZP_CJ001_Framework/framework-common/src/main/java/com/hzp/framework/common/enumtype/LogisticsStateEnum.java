/**
 * 
 */
package com.hzp.framework.common.enumtype;

/**
 * 订单id
 * @author gsw
 *
 */
public enum LogisticsStateEnum {
	
	DEFAULT("0", "协调中"),
	COORDINATED("1", "已调中"),
	SHIPPED("2", "发货中"),
	SUCCESS("3","已完成");
	
	private String id;
	private String content;
	
	LogisticsStateEnum(String id, String content) {
		this.id = id;
		this.content = content;
	}

	public String getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}

	public static String getName(String id) {
		String content = "";
		for(LogisticsStateEnum starLevel:LogisticsStateEnum.values()) { 
			if (id.equals(starLevel.getId())) {
				content = starLevel.getContent();
			 	break;
			}			
		}
		return content;	
	}
}
