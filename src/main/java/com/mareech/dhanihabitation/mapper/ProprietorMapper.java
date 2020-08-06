package com.mareech.dhanihabitation.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mareech.dhanihabitation.dto.ProprietorDTO;
import com.mareech.dhanihabitation.model.Proprietor;
import com.mareech.dhanihabitation.model.ProprietorType;
import com.mareech.dhanihabitation.repository.ProprietorTypeRepository;

@Component
public class ProprietorMapper implements AbstractMapper<ProprietorDTO, Proprietor>{

	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	ProprietorTypeRepository proprietorTypeRepository;

	@Override
	public ProprietorDTO modelToDTOMap(Proprietor model) {
		ProprietorDTO dtoObject = modelMapper.map(model, ProprietorDTO.class);
		dtoObject.setProprietorTypeId(model.getProprietorType() != null ? model.getProprietorType().getId() : null);
		dtoObject.setProprietorType(model.getProprietorType() != null ? model.getProprietorType().getName() : null);
		dtoObject.setUnits(model.getUnits() != null ? model.getUnits() : null);
		return dtoObject;
	}

	@Override
	public Proprietor dtoToModelMap(ProprietorDTO dto) {
		Proprietor modelObj = modelMapper.map(dto, Proprietor.class);
		Optional<ProprietorType> proprietorObj = proprietorTypeRepository.findById(dto.getProprietorTypeId());
		if(proprietorObj.isPresent())
		{
			modelObj.setProprietorType(proprietorObj.get());
		}
		return modelObj;
	}

	@Override
	public List<ProprietorDTO> modelToDTOList(List<Proprietor> modelList) {
		List<ProprietorDTO> proprietorDTOList = new ArrayList<>();
		modelList.forEach(el -> {
			ProprietorDTO proprietorDTO = new ProprietorDTO();
			
			proprietorDTO.setId(el.getId());
			proprietorDTO.setName(el.getName());
			proprietorDTO.setContactNumber(el.getContactNumber());
			proprietorDTO.setProprietorTypeId(el.getProprietorType() != null ? el.getProprietorType().getId() : null);
			proprietorDTO.setProprietorType(el.getProprietorType() != null ? el.getProprietorType().getName() : null);
			proprietorDTO.setEmail(el.getEmail());
			proprietorDTO.setAddress(el.getAddress());
			proprietorDTO.setYearOfEstablishment(el.getYearOfEstablishment());
			proprietorDTO.setDescription(el.getDescription());
			proprietorDTO.setLongitude(el.getLongitude());
			proprietorDTO.setLattitude(el.getLattitude());
			proprietorDTO.setPincode(el.getPincode());
			proprietorDTO.setUnits(el.getUnits());

			proprietorDTOList.add(proprietorDTO);
		});
		return proprietorDTOList;
	}

	@Override
	public List<Proprietor> dtoToModelList(List<ProprietorDTO> dtoList) {
		List<Proprietor> proprietorModelList = new ArrayList<>();
		dtoList.forEach(el -> {
			Proprietor proprietor = new Proprietor();
			
			proprietor.setId(el.getId());
			proprietor.setName(el.getName());
			proprietor.setContactNumber(el.getContactNumber());
			proprietor.setProprietorType(el.getProprietorTypeId() != null ? proprietorTypeRepository.findById(el.getProprietorTypeId()).get() : null);
			proprietor.setEmail(el.getEmail());
			proprietor.setAddress(el.getAddress());
			proprietor.setYearOfEstablishment(el.getYearOfEstablishment());
			proprietor.setDescription(el.getDescription());
			proprietor.setLongitude(el.getLongitude());
			proprietor.setLattitude(el.getLattitude());
			proprietor.setPincode(el.getPincode());

			proprietorModelList.add(proprietor);
		});
		return proprietorModelList;
	}
}