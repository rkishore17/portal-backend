package com.mareech.dhanihabitation.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "room")
public class Room extends Common {
	
	@Column(name = "room_number", length = 16, nullable = false)
	private String roomNumber;
	
	@Column(name = "description", length = 256, nullable = true)
	private String description;
	
	@Column(name = "availableSlots", length = 16, nullable = false)
	private Integer availableSlots;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "unit_id", foreignKey = @ForeignKey(name = "FK_UNIT"), referencedColumnName = "id")
	private Unit unit;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sharing_id", foreignKey = @ForeignKey(name = "FK_SHARING"), referencedColumnName = "id")
	private SharingType sharingType;
	
	@ManyToMany
    @JoinTable(name="room_amenities_map",
    joinColumns = @JoinColumn(name = "room_id", foreignKey = @ForeignKey(name="FK_ROOM_AMENITY")),
    inverseJoinColumns = @JoinColumn(name = "amenity_id", foreignKey = @ForeignKey(name = "FK_AMENITY_ROOM")))
    private List<Amenities> amenities;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "available_status_id", foreignKey = @ForeignKey(name = "FK_AVIL_STATUS"), referencedColumnName = "id")
	private AvailableStatus availableStatus;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public SharingType getSharingType() {
		return sharingType;
	}

	public void setSharingType(SharingType sharingType) {
		this.sharingType = sharingType;
	}

	public List<Amenities> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<Amenities> amenities) {
		this.amenities = amenities;
	}

	public AvailableStatus getAvailableStatus() {
		return availableStatus;
	}

	public void setAvailableStatus(AvailableStatus availableStatus) {
		this.availableStatus = availableStatus;
	}

	public Integer getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(Integer availableSlots) {
		this.availableSlots = availableSlots;
	}
}
