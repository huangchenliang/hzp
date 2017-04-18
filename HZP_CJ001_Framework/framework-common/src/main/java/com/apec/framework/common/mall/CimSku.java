package com.apec.framework.common.mall;

import java.math.BigDecimal;

public class CimSku {

	
	private Long cimsSkuId=0L;
	
	private Integer cimsSkuNum=0;
	
	private BigDecimal cimPrice=new BigDecimal(0);

	public Long getCimsSkuId() {
		return cimsSkuId;
	}

	public void setCimsSkuId(Long cimsSkuId) {
		this.cimsSkuId = cimsSkuId;
	}

	public Integer getCimsSkuNum() {
		return cimsSkuNum;
	}

	public void setCimsSkuNum(Integer cimsSkuNum) {
		this.cimsSkuNum = cimsSkuNum;
	}

	public BigDecimal getCimPrice() {
		return cimPrice;
	}

	public void setCimPrice(BigDecimal cimPrice) {
		this.cimPrice = cimPrice;
	}
}
