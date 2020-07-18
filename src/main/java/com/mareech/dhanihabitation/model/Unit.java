package com.mareech.dhanihabitation.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "unit")
public class Unit extends Common {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "proprietor_id", foreignKey = @ForeignKey(name = "FK_PROPRIETOR"), referencedColumnName = "id")
	private Proprietor proprietor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "unit_type_id", foreignKey = @ForeignKey(name = "FK_UNIT_TYPE"), referencedColumnName = "id")
	private UnitType unitType;
	
	@Column(name = "unit_name", length = 50, nullable = false)
	private String name;
	
	@Column(name = "longitude", length = 16, nullable = false)
	private Double longitude;
	
	@Column(name = "lattitude", length = 16, nullable = false)
	private Double lattitude;
	
	@Column(name = "pincode", length = 16, nullable = false)
	private String pincode;
	
	@Column(name = "landmark", length = 30, nullable = false)
	private String landmark;
	
	@Column(name = "status", length = 5, nullable = false)
	private String status;
	
	@Column(name = "contact_number", length = 15, nullable = false)
	private String contactNumber;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "address", length = 50, nullable = false)
	private String address;

	public Proprietor getProprietor() {
		return proprietor;
	}

	public void setProprietor(Proprietor proprietor) {
		this.proprietor = proprietor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UnitType getUnitType() {
		return unitType;
	}

	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
}
