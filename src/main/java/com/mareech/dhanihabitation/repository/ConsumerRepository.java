package com.mareech.dhanihabitation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mareech.dhanihabitation.model.Consumer;
import com.mareech.dhanihabitation.model.Room;

public interface ConsumerRepository extends JpaRepository<Consumer, Long>{

	public List<Consumer> findByRoom(Room room);
}
