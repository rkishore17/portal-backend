package com.mareech.dhanihabitation.dto;

import java.sql.Date;

public class ProprietorDTO{
	
	private Long id;
	private String name;
	private String contactNumber;
	private Long proprietorTypeId;
	private String proprietorType;
	private String email;
	private String address;
	private Date yearOfEstablishment;
	private String description;
	private Double longitude;
	private Double lattitude;
	private String pincode;
	private Date createdDate;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public Date getYearOfEstablishment() {
		return yearOfEstablishment;
	}
	
	public void setYearOfEstablishment(Date yearOfEstablishment) {
		this.yearOfEstablishment = yearOfEstablishment;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
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
	
	public Long getProprietorTypeId() {
		return proprietorTypeId;
	}

	public void setProprietorTypeId(Long proprietorTypeId) {
		this.proprietorTypeId = proprietorTypeId;
	}

	public String getProprietorType() {
		return proprietorType;
	}

	public void setProprietorType(String proprietorType) {
		this.proprietorType = proprietorType;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}	
}
