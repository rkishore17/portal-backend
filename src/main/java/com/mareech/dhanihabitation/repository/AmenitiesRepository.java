package com.mareech.dhanihabitation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mareech.dhanihabitation.model.Amenities;

public interface AmenitiesRepository extends JpaRepository<Amenities, Long>{

	public List<Amenities> findByIdIn(List<Long> amenityNames);
}
