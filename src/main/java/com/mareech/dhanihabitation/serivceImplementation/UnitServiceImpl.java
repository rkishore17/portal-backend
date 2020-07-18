package com.mareech.dhanihabitation.serivceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mareech.dhanihabitation.Utils;
import com.mareech.dhanihabitation.dto.PagingAndSortingDTO;
import com.mareech.dhanihabitation.dto.UnitDTO;
import com.mareech.dhanihabitation.exception.ProprietorNotFoundException;
import com.mareech.dhanihabitation.mapper.UnitMapper;
import com.mareech.dhanihabitation.model.Proprietor;
import com.mareech.dhanihabitation.model.Unit;
import com.mareech.dhanihabitation.model.UnitType;
import com.mareech.dhanihabitation.repository.ProprietorRepository;
import com.mareech.dhanihabitation.repository.UnitRepository;
import com.mareech.dhanihabitation.repository.UnitTypeRepository;
import com.mareech.dhanihabitation.service.UnitService;

@Service
public class UnitServiceImpl implements UnitService{
	
	@Autowired
	UnitRepository unitRepository;

	@Autowired
	UnitTypeRepository unitTypeRepository;
	
	@Autowired
	ProprietorRepository proprietorRepository;
	
	@Autowired
	UnitMapper unitMapper;

	@Override
	public List<UnitDTO> getAllUnits(PagingAndSortingDTO pagingAndSortingDTO) {
		try {
			Pageable pageable = Utils.getPageRequest(pagingAndSortingDTO);
			List<Unit> unit = unitRepository.findAll(pageable).getContent();
			return unitMapper.modelToDTOList(unit);
		} catch (Exception e) {
			throw new ProprietorNotFoundException("Data not found");
		}
	}

	@Override
	public UnitDTO saveAndUpdateUnit(UnitDTO unitDTO) {
		try {
			Unit unit = unitRepository.saveAndFlush(unitMapper.dtoToModelMap(unitDTO));
			return unitMapper.modelToDTOMap(unit);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public UnitDTO getUnitById(Long id) {
		try {
			Optional<Unit> unit = unitRepository.findById(id);
			if (unit.isPresent()) 
			{
				return unitMapper.modelToDTOMap(unit.get());
			}
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public List<UnitDTO> getUnitByType(Long id, PagingAndSortingDTO pagingAndSortingDTO) {
		try {
			List<UnitDTO> unitDTOList = new ArrayList<>();
			Pageable pageable = Utils.getPageRequest(pagingAndSortingDTO);
			Optional<UnitType> unitType = unitTypeRepository.findById(id);
			if (unitType.isPresent()) 
			{
				List<Unit> units = unitRepository.findByUnitType(unitType.get(), pageable).getContent();
				unitDTOList = unitMapper.modelToDTOList(units);
			}
			return unitDTOList;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	@Override
	public List<UnitDTO> getUnitByProprietoryId(Long id, PagingAndSortingDTO pagingAndSortingDTO) {
		try {
			List<UnitDTO> unitDTOList = new ArrayList<>();
			Pageable pageable = Utils.getPageRequest(pagingAndSortingDTO);
			Optional<Proprietor> proprietor = proprietorRepository.findById(id);
			if (proprietor.isPresent()) 
			{
				List<Unit> units = unitRepository.findByProprietor(proprietor.get(), pageable).getContent();
				unitDTOList = unitMapper.modelToDTOList(units);
			}
			return unitDTOList;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
