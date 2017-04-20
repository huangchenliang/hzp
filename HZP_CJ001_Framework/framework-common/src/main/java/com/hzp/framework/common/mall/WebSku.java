package com.hzp.framework.common.mall;

import java.util.ArrayList;
import java.util.List;

public class WebSku {

	private Long webSkuId;
	
	private List<CimSku>list=new ArrayList<CimSku>();

	public Long getWebSkuId() {
		return webSkuId;
	}

	public void setWebSkuId(Long webSkuId) {
		this.webSkuId = webSkuId;
	}

	public List<CimSku> getList() {
		return list;
	}

	public void setList(List<CimSku> list) {
		this.list = list;
	}
	
}
