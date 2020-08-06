package com.mareech.dhanihabitation.service;

import java.util.List;

import com.mareech.dhanihabitation.dto.PagingAndSortingDTO;
import com.mareech.dhanihabitation.dto.ProprietorDTO;

public interface ProprietorService {
	public List<ProprietorDTO> getAllProprietor(PagingAndSortingDTO pagingAndSortingDTO);
	public ProprietorDTO saveAndUpdateProprietor(ProprietorDTO proprietorDTO);
	public ProprietorDTO getProprietorById(Long id);
	public List<ProprietorDTO> getProprietorByNameOrPhone(String name, PagingAndSortingDTO pagingAndSortingDTO);
	public int updateProprietorName(Long id, String name);
}
