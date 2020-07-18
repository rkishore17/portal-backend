package com.mareech.dhanihabitation.dto;

public class UnitDTO {
	
	private Long id;
	private Long proprietorId;
	private String proprietorName;
	private Long unitTypeId;
	private String unitTypeName;
	private String name;	
	private String contactNumber;
	private String email;
	private String address;
	private String status;
	private Double longitude;
	private Double lattitude;
	private String pincode;
	private String landmark;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getProprietorId() {
		return proprietorId;
	}
	
	public void setProprietorId(Long proprietorId) {
		this.proprietorId = proprietorId;
	}
	
	public String getProprietorName() {
		return proprietorName;
	}
	
	public void setProprietorName(String proprietorName) {
		this.proprietorName = proprietorName;
	}
	
	public Long getUnitTypeId() {
		return unitTypeId;
	}
	
	public void setUnitTypeId(Long unitTypeId) {
		this.unitTypeId = unitTypeId;
	}
	
	public String getUnitTypeName() {
		return unitTypeName;
	}
	
	public void setUnitTypeName(String unitTypeName) {
		this.unitTypeName = unitTypeName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public Double getLattitude() {
		return lattitude;
	}
	
	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}
	
	public String getPincode() {
		return pincode;
	}
	
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String getLandmark() {
		return landmark;
	}
	
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
}
