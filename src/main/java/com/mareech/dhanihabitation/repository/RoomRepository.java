package com.mareech.dhanihabitation.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mareech.dhanihabitation.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

	public Page<Room> findAll(Pageable pageable);
}
