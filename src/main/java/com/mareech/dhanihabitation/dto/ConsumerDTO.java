package com.mareech.dhanihabitation.dto;

import java.util.Date;

public class ConsumerDTO {

    private Long roomId;
    private String roomNo;
	private Long bloodGroupId;
	private String bloodGroupName;
	private String firstName;	
	private String lastName;		
	private String contactNumber;		
	private String email;		
	private String address;		
	private String pincode;		
	private String occupation;		
	private Date dateOfJoining;
	private Date dateOfRelieving;
	private String monthlyRentAmount;
	private String depositAmount;
	private String activeStatus;
	private String gaurdianName;
	private String gaurdianContactNumber;
	
	public Long getRoomId() {
		return roomId;
	}
	
	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}
	
	public String getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	
	public Long getBloodGroupId() {
		return bloodGroupId;
	}
	
	public void setBloodGroupId(Long bloodGroupId) {
		this.bloodGroupId = bloodGroupId;
	}
	
	public String getBloodGroupName() {
		return bloodGroupName;
	}
	
	public void setBloodGroupName(String bloodGroupName) {
		this.bloodGroupName = bloodGroupName;
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
}
