package com.hzp.framework.dto;

import com.hzp.framework.common.enumtype.OrderWay;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderLogisticVO {
	private String orderNo;
	private Long id;
	private Integer saleId;
	private String saleName;
	private String userName;
	private String userPhone;
	private OrderWay orderWay = OrderWay.ORDER_PHONE;
	private BigDecimal originalOrderAmount = new BigDecimal(0);

	private BigDecimal orderAmount = new BigDecimal(0);

	private BigDecimal taxes = new BigDecimal(0);

	private BigDecimal logisticsCost = new BigDecimal(0);

	private BigDecimal discountCut = new BigDecimal(0);
	private BigDecimal couponCut = new BigDecimal(0);
	private Integer cityId;
	private String remark;
	private List<OrderLogisticDetailVO> goodsList;
	private Integer buyId;
	private Date sendTime;
	private String addrName;
	private String shopName;

	private String marketerId;
	private String addrId;

	private BigDecimal csCut = new BigDecimal(0);

	private String userIds;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public OrderWay getOrderWay() {
		return orderWay;
	}

	public void setOrderWay(OrderWay orderWay) {
		this.orderWay = orderWay;
	}

	public BigDecimal getOriginalOrderAmount() {
		return originalOrderAmount;
	}

	public void setOriginalOrderAmount(BigDecimal originalOrderAmount) {
		this.originalOrderAmount = originalOrderAmount;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public BigDecimal getTaxes() {
		return taxes;
	}

	public void setTaxes(BigDecimal taxes) {
		this.taxes = taxes;
	}

	public BigDecimal getLogisticsCost() {
		return logisticsCost;
	}

	public void setLogisticsCost(BigDecimal logisticsCost) {
		this.logisticsCost = logisticsCost;
	}

	public BigDecimal getDiscountCut() {
		return discountCut;
	}

	public void setDiscountCut(BigDecimal discountCut) {
		this.discountCut = discountCut;
	}

	public BigDecimal getCouponCut() {
		return couponCut;
	}

	public void setCouponCut(BigDecimal couponCut) {
		this.couponCut = couponCut;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<OrderLogisticDetailVO> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<OrderLogisticDetailVO> goodsList) {
		this.goodsList = goodsList;
	}

	public Integer getBuyId() {
		return buyId;
	}

	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getAddrName() {
		return addrName;
	}

	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getMarketerId() {
		return marketerId;
	}

	public void setMarketerId(String marketerId) {
		this.marketerId = marketerId;
	}

	public String getAddrId() {
		return addrId;
	}

	public void setAddrId(String addrId) {
		this.addrId = addrId;
	}

	public String getUserIds() {
		return userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public BigDecimal getCsCut() {
		return csCut;
	}

	public void setCsCut(BigDecimal csCut) {
		this.csCut = csCut;
	}

}
