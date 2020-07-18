package com.mareech.dhanihabitation.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "proprietor")
public class Proprietor extends Common {
	
	@Column(name = "name", length = 50, nullable = false)
	private String name;
	
	@Column(name = "contact_number", length = 15, nullable = false)
	private String contactNumber;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "address", length = 50, nullable = false)
	private String address;
	
	@Column(name = "year_of_establishment", nullable = false)
	private Date yearOfEstablishment;
	
	@Column(name = "description", length = 256)
	private String description;
	
	@Column(name = "longitude", length = 16, nullable = false)
	private Double longitude;
	
	@Column(name = "lattitude", length = 16, nullable = false)
	private Double lattitude;
	
	@Column(name = "pincode", length = 16, nullable = false)
	private String pincode;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "proprietor_type_id", foreignKey = @ForeignKey(name = "FK_PROP_TYPE"), referencedColumnName = "id")
	private ProprietorType proprietorType;

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

	public ProprietorType getProprietorType() {
		return proprietorType;
	}

	public void setProprietorType(ProprietorType proprietorType) {
		this.proprietorType = proprietorType;
	}
}
