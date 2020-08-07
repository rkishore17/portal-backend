package com.mareech.dhanihabitation.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mareech.dhanihabitation.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

	public Page<Room> findAll(Pageable pageable);
	
	@Query("SELECT DISTINCT room FROM Room room "
			+ " INNER JOIN room.unit u "
			+ " INNER JOIN u.proprietor p "
			+ " INNER JOIN room.amenities amenity"
			+ " WHERE p.id = 1 and room.availableStatus.id = 1 and room.availableSlots > 0 and"
			+ " (COALESCE(:unitId, null) is null or u.id in :unitId) and "
			+ " (COALESCE(:sharingId, null) is null or room.sharingType.id in :sharingId) and "
			+ " (COALESCE(:amenityId, null) is null or amenity.id in :amenityId)")
	public List<Room> getFilterCriteria(@Param("unitId") List<Long> unitId, @Param("sharingId") List<Long> sharingId, 
			@Param("amenityId") List<Long> amenityId);
}