package com.mareech.dhanihabitation.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mareech.dhanihabitation.model.Proprietor;
import com.mareech.dhanihabitation.model.Unit;
import com.mareech.dhanihabitation.model.UnitType;

public interface UnitRepository extends JpaRepository<Unit, Long>{
	
	public Page<Unit> findAll(Pageable pageable);
	public Page<Unit> findByUnitType(UnitType unitType, Pageable pageable);
	public Page<Unit> findByProprietor(Proprietor proprietor, Pageable pageable);
}
