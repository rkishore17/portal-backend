package com.mareech.dhanihabitation.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mareech.dhanihabitation.model.Proprietor;

public interface ProprietorRepository extends JpaRepository<Proprietor, Long>{
	
	public Page<Proprietor> findAll(Pageable pageable);
	public Page<Proprietor> findByNameContainingOrContactNumberContaining(String name, String contactNumber, Pageable pageable);
}
