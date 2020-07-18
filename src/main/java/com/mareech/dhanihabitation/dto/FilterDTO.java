package com.mareech.dhanihabitation.dto;

import java.util.List;

public class FilterDTO {

	private List<AmenitiesDTO> amenities;
	private List<SharingTypeDTO> sharingType;
	private List<UnitDTO> units;
	private List<AvailableStatusDTO> availableStatus;
	
	public List<AmenitiesDTO> getAmenities() {
		return amenities;
	}
	
	public void setAmenities(List<AmenitiesDTO> amenities) {
		this.amenities = amenities;
	}
	
	public List<SharingTypeDTO> getSharingType() {
		return sharingType;
	}
	
	public void setSharingType(List<SharingTypeDTO> sharingType) {
		this.sharingType = sharingType;
	}

	public List<UnitDTO> getUnits() {
		return units;
	}

	public void setUnits(List<UnitDTO> units) {
		this.units = units;
	}

	public List<AvailableStatusDTO> getAvailableStatus() {
		return availableStatus;
	}

	public void setAvailableStatus(List<AvailableStatusDTO> availableStatus) {
		this.availableStatus = availableStatus;
	}
}
