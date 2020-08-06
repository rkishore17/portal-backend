package com.mareech.dhanihabitation.repository;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mareech.dhanihabitation.model.Proprietor;

public interface ProprietorRepository extends JpaRepository<Proprietor, Long>{
	
	public Page<Proprietor> findAll(Pageable pageable);
	public Page<Proprietor> findByNameContainingOrContactNumberContaining(String name, String contactNumber, Pageable pageable);

	@Modifying
	@Transactional
	@Query("update Proprietor p set p.name = :name where p.id = :id")
	public int updateProprietorName(@Param("id") Long id, @Param("name") String name);
}
