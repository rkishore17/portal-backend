package com.mareech.dhanihabitation.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mareech.dhanihabitation.dto.UnitDTO;
import com.mareech.dhanihabitation.model.Proprietor;
import com.mareech.dhanihabitation.model.Unit;
import com.mareech.dhanihabitation.model.UnitType;
import com.mareech.dhanihabitation.repository.ProprietorRepository;
import com.mareech.dhanihabitation.repository.UnitRepository;
import com.mareech.dhanihabitation.repository.UnitTypeRepository;

@Component
public class UnitMapper implements AbstractMapper<UnitDTO, Unit>{

	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	UnitRepository unitRepository;
	
	@Autowired
	ProprietorRepository proprietorRepository;
	
	@Autowired
	UnitTypeRepository unitTypeRepository;
	
	@Override
	public UnitDTO modelToDTOMap(Unit model) {
		UnitDTO dtoObject = modelMapper.map(model, UnitDTO.class);
		dtoObject.setProprietorId(model.getProprietor() != null ? model.getProprietor().getId() : null);
		dtoObject.setProprietorName(model.getProprietor() != null ? model.getProprietor().getName() : null);
		dtoObject.setUnitTypeId(model.getUnitType() != null ? model.getUnitType().getId() : null);
		dtoObject.setUnitTypeName(model.getUnitType() != null ? model.getUnitType().getName() : null);
		
		return dtoObject;
	}

	@Override
	public Unit dtoToModelMap(UnitDTO dto) {
		Unit unit = modelMapper.map(dto, Unit.class);
		Optional<Proprietor> proprietorObj = proprietorRepository.findById(dto.getProprietorId());
		if(proprietorObj.isPresent())
		{
			unit.setProprietor(proprietorObj.get());
		}
		
		Optional<UnitType> unitTypeObj = unitTypeRepository.findById(dto.getUnitTypeId());
		if(unitTypeObj.isPresent())
		{
			unit.setUnitType(unitTypeObj.get());
		}
		
		return unit;
	}

	@Override
	public List<UnitDTO> modelToDTOList(List<Unit> modelList) {
		List<UnitDTO> unitDTOList = new ArrayList<>();
		modelList.forEach(el -> {
			UnitDTO unitDTO = new UnitDTO();
			
			unitDTO.setId(el.getId());
			unitDTO.setProprietorId(el.getProprietor() != null ? el.getProprietor().getId() : null);
			unitDTO.setProprietorName(el.getProprietor() != null ? el.getProprietor().getProprietorType().getName() : null);
			unitDTO.setUnitTypeId(el.getUnitType() != null ? el.getUnitType().getId() : null);
			unitDTO.setUnitTypeName(el.getUnitType() != null ? el.getUnitType().getName() : null);
			unitDTO.setName(el.getName());
			unitDTO.setContactNumber(el.getContactNumber());
			unitDTO.setEmail(el.getEmail());
			unitDTO.setAddress(el.getAddress());
			unitDTO.setStatus(el.getStatus());
			unitDTO.setLongitude(el.getLongitude());
			unitDTO.setLattitude(el.getLattitude());
			unitDTO.setPincode(el.getPincode());
			unitDTO.setLandmark(el.getLandmark());
			
			unitDTOList.add(unitDTO);
		});
		return unitDTOList;
	}

	@Override
	public List<Unit> dtoToModelList(List<UnitDTO> dtoList) {
		List<Unit> units = new ArrayList<>();
		dtoList.forEach(el -> {
			Unit unit = new Unit();
			
			unit.setId(el.getId());
			unit.setProprietor(proprietorRepository.findById(el.getProprietorId()).get());
			unit.setUnitType(unitTypeRepository.findById(el.getUnitTypeId()).get());
			unit.setName(el.getName());
			unit.setContactNumber(el.getContactNumber());
			unit.setEmail(el.getEmail());
			unit.setAddress(el.getAddress());
			unit.setStatus(el.getStatus());
			unit.setLongitude(el.getLongitude());
			unit.setLattitude(el.getLattitude());
			unit.setPincode(el.getPincode());
			unit.setLandmark(el.getLandmark());
			
			units.add(unit);
		});
		return units;
	}
}
