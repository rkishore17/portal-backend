package com.mareech.dhanihabitation.serivceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mareech.dhanihabitation.Utils;
import com.mareech.dhanihabitation.dto.PagingAndSortingDTO;
import com.mareech.dhanihabitation.dto.ProprietorDTO;
import com.mareech.dhanihabitation.exception.ProprietorNotFoundException;
import com.mareech.dhanihabitation.mapper.ProprietorMapper;
import com.mareech.dhanihabitation.model.Proprietor;
import com.mareech.dhanihabitation.repository.ProprietorRepository;
import com.mareech.dhanihabitation.service.ProprietorService;


@Service
public class ProprietorServiceImpl implements ProprietorService {

	@Autowired
	ProprietorRepository proprietorRepository;
	
	@Autowired
	ProprietorMapper proprietorMapper;
	
	@Override
	public List<ProprietorDTO> getAllProprietor(PagingAndSortingDTO pagingAndSortingDTO)
	{
		try {
			Pageable pageable = Utils.getPageRequest(pagingAndSortingDTO);
			List<Proprietor> properitor = proprietorRepository.findAll(pageable).getContent();
			return proprietorMapper.modelToDTOList(properitor);
		} catch (Exception e) {
			throw new ProprietorNotFoundException("Data not found");
		}
	}

	@Override
	public ProprietorDTO saveAndUpdateProprietor(ProprietorDTO proprietorDTO) 
	{
		try {
			Proprietor proprietorModel = proprietorRepository.saveAndFlush(proprietorMapper.dtoToModelMap(proprietorDTO));
			return proprietorMapper.modelToDTOMap(proprietorModel);
		} catch (Exception e) {
			 throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public ProprietorDTO getProprietorById(Long id) 
	{
		try {
			Optional<Proprietor> proprietorModel = proprietorRepository.findById(id);
			if(proprietorModel.isPresent())
			{
				return proprietorMapper.modelToDTOMap(proprietorModel.get());
			}
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public List<ProprietorDTO> getProprietorByNameOrPhone(String name, PagingAndSortingDTO pagingAndSortingDTO) 
	{
		try {
			Pageable pageable = Utils.getPageRequest(pagingAndSortingDTO);
			List<Proprietor> proprietorList = proprietorRepository.findByNameContainingOrContactNumberContaining(name, name, pageable).getContent();
			return proprietorMapper.modelToDTOList(proprietorList);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public int updateProprietorName(Long id, String name) 
	{
		try {
			return proprietorRepository.updateProprietorName(id, name);
		} catch (Exception e) {
			 throw new RuntimeException(e.getMessage());
		}
	}
}
