package com.apec.framework.dto;

public class ContactVO {

	private String id;

	/**
	 * 联系人编号
	 */
	private  String contactNo;

	private String customerNo;

	private String contactName;

	private String contactPost;

	private String contactPhone;

	private String contactTel;

	private String contactSex;

	private String contactAge;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPost() {
		return contactPost;
	}

	public void setContactPost(String contactPost) {
		this.contactPost = contactPost;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getContactSex() {
		return contactSex;
	}

	public void setContactSex(String contactSex) {
		this.contactSex = contactSex;
	}

	public String getContactAge() {
		return contactAge;
	}

	public void setContactAge(String contactAge) {
		this.contactAge = contactAge;
	}

	/**
	 * 获取 联系人编号
	 */
	public String getContactNo()
	{
		return this.contactNo;
	}

	/**
	 * 设置 联系人编号
	 */
	public void setContactNo(String contactNo)
	{
		this.contactNo = contactNo;
	}
}