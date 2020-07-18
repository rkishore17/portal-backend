package com.mareech.dhanihabitation.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mareech.dhanihabitation.dto.RoomDTO;
import com.mareech.dhanihabitation.model.Amenities;
import com.mareech.dhanihabitation.model.AvailableStatus;
import com.mareech.dhanihabitation.model.Room;
import com.mareech.dhanihabitation.model.SharingType;
import com.mareech.dhanihabitation.model.Unit;
import com.mareech.dhanihabitation.repository.AmenitiesRepository;
import com.mareech.dhanihabitation.repository.AvailableStatusRepository;
import com.mareech.dhanihabitation.repository.RoomRepository;
import com.mareech.dhanihabitation.repository.SharingTypeRepository;
import com.mareech.dhanihabitation.repository.UnitRepository;

@Component
public class RoomMapper implements AbstractMapper<RoomDTO, Room>{

	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	AmenitiesMapper amenitiesMapper;
	
	@Autowired
	RoomRepository roomRepository;
	
	@Autowired
	UnitRepository unitRepository;
	
	@Autowired
	SharingTypeRepository sharingTypeRepository;
	
	@Autowired
	AvailableStatusRepository availableStatusRepository;
	
	@Autowired
	AmenitiesRepository amenityRepository;
	
	@Override
	public RoomDTO modelToDTOMap(Room model) {
		RoomDTO dtoObject = modelMapper.map(model, RoomDTO.class);
		dtoObject.setUnitId(model.getUnit() != null ? model.getUnit().getId() : null);
		dtoObject.setUnitName(model.getUnit() != null ? model.getUnit().getName() : null);
		dtoObject.setUnitTypeId(model.getUnit() != null && model.getUnit().getUnitType() != null ? model.getUnit().getUnitType().getId() : null);
		dtoObject.setUnitTypeName(model.getUnit() != null && model.getUnit().getUnitType() != null ? model.getUnit().getUnitType().getName() : null);
		dtoObject.setSharingTypeId(model.getSharingType() != null ? model.getSharingType().getId() : null);
		dtoObject.setSharingTypeName(model.getSharingType() != null ? model.getSharingType().getName() : null);
		dtoObject.setAvailableStatusId(model.getAvailableStatus() != null ? model.getAvailableStatus().getId() : null);
		dtoObject.setAvailableStatusName(model.getAvailableStatus() != null ? model.getAvailableStatus().getName() : null);
		dtoObject.setAmenities(model.getAmenities() != null ? amenitiesMapper.modelToDTOList(model.getAmenities()) : null);
		
		return dtoObject;
	}

	@Override
	public Room dtoToModelMap(RoomDTO dto) {
		Room room = modelMapper.map(dto, Room.class);
		Optional<Unit> unitObj = unitRepository.findById(dto.getUnitId());
		if(unitObj.isPresent())
		{
			room.setUnit(unitObj.get());
		}
		
		Optional<SharingType> sharingTypeObj = sharingTypeRepository.findById(dto.getSharingTypeId());
		if (sharingTypeObj.isPresent()) 
		{
			room.setSharingType(sharingTypeObj.get());
		}
		
		Optional<AvailableStatus> availableStatusObj = availableStatusRepository.findById(dto.getAvailableStatusId());
		if (availableStatusObj.isPresent()) 
		{
			room.setAvailableStatus(availableStatusObj.get());
		}
		
		if(dto.getAmenities() != null)
		{
			List<String> aminityNames = new ArrayList<>();
			dto.getAmenities().forEach(el -> aminityNames.add(el.getName()));
			
			List<Amenities> aminities = amenityRepository.findByNameIn(aminityNames);
			room.setAmenities(aminities);
		}
		
		return room;
	}

	@Override
	public List<RoomDTO> modelToDTOList(List<Room> modelList) {
		return null;
	}

	@Override
	public List<Room> dtoToModelList(List<RoomDTO> dtoList) {
		return null;
	}
}
