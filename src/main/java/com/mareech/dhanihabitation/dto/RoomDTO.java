package com.mareech.dhanihabitation.dto;

import java.util.List;

public class RoomDTO {

	private Long id;
	private String roomNumber;
	private Long unitId;
	private String unitName;
	private Long unitTypeId;
	private String unitTypeName;
	private Long sharingTypeId;
	private String sharingTypeName;
	private String description;
	private Long availableStatusId;
	private String availableStatusName;
	private	List<AmenitiesDTO> amenities;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Long getUnitId() {
		return unitId;
	}
	
	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}
	
	public String getUnitName() {
		return unitName;
	}
	
	public void setUnitName(String unitName) {
		this.unitName = unitName;
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
	
	public Long getSharingTypeId() {
		return sharingTypeId;
	}
	
	public void setSharingTypeId(Long sharingTypeId) {
		this.sharingTypeId = sharingTypeId;
	}
	
	public String getSharingTypeName() {
		return sharingTypeName;
	}
	
	public void setSharingTypeName(String sharingTypeName) {
		this.sharingTypeName = sharingTypeName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getAvailableStatusId() {
		return availableStatusId;
	}
	
	public void setAvailableStatusId(Long availableStatusId) {
		this.availableStatusId = availableStatusId;
	}
	
	public String getAvailableStatusName() {
		return availableStatusName;
	}
	
	public void setAvailableStatusName(String availableStatusName) {
		this.availableStatusName = availableStatusName;
	}

	public List<AmenitiesDTO> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<AmenitiesDTO> amenities) {
		this.amenities = amenities;
	}
}
