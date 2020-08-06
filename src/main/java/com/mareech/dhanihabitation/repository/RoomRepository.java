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
	
	@Query("SELECT room FROM Room room "
			+ " INNER JOIN Unit unit ON unit.id = room.unitId"
			+ " INNER JOIN Proprietor proprietor ON proprietor.id = unit.proprietorId"
			+ " WHERE proprietor.id = 1 and unit.id in (1,2)")
	public List<Room> getFilterCriteria(@Param("unitId") List<Long> unitId);
}
