package com.mareech.dhanihabitation.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "consumer")
public class Consumer extends Common {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "room_id", foreignKey = @ForeignKey(name = "FK_ROOM"), referencedColumnName = "id")
	private Room room;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "blood_group_id", foreignKey = @ForeignKey(name = "FK_BLOOD_TYPE"), referencedColumnName = "id")
	private BloodGroup bloodGroup;
	
	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length = 50, nullable = false)
	private String lastName;
	
	@Column(name = "contact_number", length = 15, nullable = false)
	private String contactNumber;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "address", length = 50, nullable = false)
	private String address;
	
	@Column(name = "pincode", length = 16, nullable = false)
	private String pincode;
	
	@Column(name = "occupation", length = 16, nullable = true)
	private String occupation;
	
	@Column(name = "date_of_joining", nullable = false)
	private Date dateOfJoining;
	
	@Column(name = "date_of_relieving", nullable = false)
	private Date dateOfRelieving;
	
	@Column(name = "monthly_rent_amount", length = 35, nullable = false)
	private String monthlyRentAmount;
	
	@Column(name = "deposit_amount", length = 35, nullable = false)
	private String depositAmount;
	
	@Column(name = "active_status", length = 12, nullable = false)
	private String activeStatus;
	
	@Column(name = "gaurdian_name", length = 35, nullable = false)
	private String gaurdianName;
	
	@Column(name = "gaurdian_contact_number", length = 15, nullable = false)
	private String gaurdianContactNumber;	

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfRelieving() {
		return dateOfRelieving;
	}

	public void setDateOfRelieving(Date dateOfRelieving) {
		this.dateOfRelieving = dateOfRelieving;
	}

	public String getMonthlyRentAmount() {
		return monthlyRentAmount;
	}

	public void setMonthlyRentAmount(String monthlyRentAmount) {
		this.monthlyRentAmount = monthlyRentAmount;
	}

	public String getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getGaurdianName() {
		return gaurdianName;
	}

	public void setGaurdianName(String gaurdianName) {
		this.gaurdianName = gaurdianName;
	}

	public String getGaurdianContactNumber() {
		return gaurdianContactNumber;
	}

	public void setGaurdianContactNumber(String gaurdianContactNumber) {
		this.gaurdianContactNumber = gaurdianContactNumber;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
}
