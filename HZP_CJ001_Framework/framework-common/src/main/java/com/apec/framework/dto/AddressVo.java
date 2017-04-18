package com.apec.framework.dto;

public class AddressVo {

	private String provinceName;
	private String cityName;
	private String cityId;
	private String areaName;
	private String proviceId;
	private String areaId;
	private float longitude;
	private String rodeName;
	private float latitude;
	private String locationDes;

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getProviceId() {
		return proviceId;
	}

	public void setProviceId(String proviceId) {
		this.proviceId = proviceId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public String getRodeName() {
		return rodeName;
	}

	public void setRodeName(String rodeName) {
		this.rodeName = rodeName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getLocationDes() {
		return locationDes;
	}

	public void setLocationDes(String locationDes) {
		this.locationDes = locationDes;
	}

}
