package com.mareech.dhanihabitation.service;

import java.util.List;

import com.mareech.dhanihabitation.dto.PagingAndSortingDTO;
import com.mareech.dhanihabitation.dto.UnitDTO;

public interface UnitService {
	public List<UnitDTO> getAllUnits(PagingAndSortingDTO pagingAndSortingDTO);
	public UnitDTO saveAndUpdateUnit(UnitDTO unitDTO);
	public UnitDTO getUnitById(Long id);
	public List<UnitDTO> getUnitByType(Long id, PagingAndSortingDTO pagingAndSortingDTO);
	public List<UnitDTO> getUnitByProprietoryId(Long id, PagingAndSortingDTO pagingAndSortingDTO);
}
