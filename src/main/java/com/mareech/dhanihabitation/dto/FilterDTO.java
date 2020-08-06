package com.mareech.dhanihabitation.dto;

import java.util.List;

public class FilterDTO {

	private List<Long> amenities;
	private List<Long> sharingType;
	private List<Long> units;
	private List<Long> rooms;
	private Long availableStatus;
	private Long proprietor;
	private List<Long> availableSlots;
	
	public List<Long> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<Long> amenities) {
		this.amenities = amenities;
	}
	
	public List<Long> getSharingType() {
		return sharingType;
	}
	
	public void setSharingType(List<Long> sharingType) {
		this.sharingType = sharingType;
	}
	
	public List<Long> getUnits() {
		return units;
	}
	
	public void setUnits(List<Long> units) {
		this.units = units;
	}
	
	public List<Long> getRooms() {
		return rooms;
	}
	
	public void setRooms(List<Long> rooms) {
		this.rooms = rooms;
	}
	
	public Long getAvailableStatus() {
		return availableStatus;
	}
	
	public void setAvailableStatus(Long availableStatus) {
		this.availableStatus = availableStatus;
	}
	
	public Long getProprietor() {
		return proprietor;
	}
	
	public void setProprietor(Long proprietor) {
		this.proprietor = proprietor;
	}
	
	public List<Long> getAvailableSlots() {
		return availableSlots;
	}
	
	public void setAvailableSlots(List<Long> availableSlots) {
		this.availableSlots = availableSlots;
	}
}
