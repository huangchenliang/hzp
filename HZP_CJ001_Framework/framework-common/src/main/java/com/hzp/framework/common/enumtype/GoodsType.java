package com.hzp.framework.common.enumtype;

public enum GoodsType {

	NONE("未定义"), NORMAL("单一商品"), GROUP("组合商品"), ENTERPRICE("企业");
	String text;

	GoodsType(String txt) {
		this.text = txt;
	}
}
