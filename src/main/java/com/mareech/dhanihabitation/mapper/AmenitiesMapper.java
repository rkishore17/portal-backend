package com.mareech.dhanihabitation.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mareech.dhanihabitation.dto.AmenitiesDTO;
import com.mareech.dhanihabitation.model.Amenities;

@Component
public class AmenitiesMapper implements AbstractMapper<AmenitiesDTO, Amenities>{
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public AmenitiesDTO modelToDTOMap(Amenities model) {
		return null;
	}

	@Override
	public Amenities dtoToModelMap(AmenitiesDTO dto) {
		return null;
	}

	@Override
	public List<AmenitiesDTO> modelToDTOList(List<Amenities> modelList) {
		return modelList.stream().map(amenity -> modelMapper.map(amenity, AmenitiesDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public List<Amenities> dtoToModelList(List<AmenitiesDTO> dtoList) {
		return dtoList.stream().map(amenity -> modelMapper.map(amenity, Amenities.class))
				.collect(Collectors.toList());
	}
}
