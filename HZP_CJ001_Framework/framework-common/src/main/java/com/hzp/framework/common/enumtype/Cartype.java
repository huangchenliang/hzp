package com.hzp.framework.common.enumtype;

/**
 *  类 编 号：
 *  类 名 称：车类型 
 *  内容摘要：
 *  创建日期：2016-09-28 11:49 
 *  编码作者：
 */
public enum Cartype {

	CAR(2, "C"), BIG(6, "B"), LONG(15, "L");

	private float wight;
	private String name;

	Cartype(float wight, String name) {
		this.wight = wight;
		this.name = name;
	}

	public float getWight() {
		return wight;
	}

	public String getName() {
		return name;
	}

	public static float getName(String name) {
		float wight = 0;
		for (Cartype starLevel : Cartype.values()) {
			if (name.equals(starLevel.getClass())) {
				wight = starLevel.getWight();
				break;
			}
		}
		return wight;
	}
}
