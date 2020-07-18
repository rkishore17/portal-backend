package com.mareech.dhanihabitation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mareech.dhanihabitation.Constants;
import com.mareech.dhanihabitation.dto.PagingAndSortingDTO;
import com.mareech.dhanihabitation.dto.ProprietorDTO;
import com.mareech.dhanihabitation.service.ProprietorService;

@RestController
@RequestMapping(value = Constants.API_END_POINT)
public class ProprietorController {
	
	@Autowired
	ProprietorService proprietorService;
	
	@PostMapping(value = Constants.FETCH_PROPRIETORS)
	public ResponseEntity<List<ProprietorDTO>> getAllProprietors(@RequestBody PagingAndSortingDTO pagingAndSortingDTO) 
	{
		List<ProprietorDTO> proprietor = proprietorService.getAllProprietor(pagingAndSortingDTO);
		return new ResponseEntity<>(proprietor, HttpStatus.OK);
	}
	
	@PostMapping(value = Constants.SAVE_AND_UPDATE_PROPRIETOR)
	public ResponseEntity<ProprietorDTO> saveProprietor(@RequestBody ProprietorDTO proprietorDTO)
	{
		ProprietorDTO proprietorResponse = proprietorService.saveAndUpdateProprietor(proprietorDTO);
		return new ResponseEntity<>(proprietorResponse, HttpStatus.OK);
	}
	
	@GetMapping(value = Constants.FETCH_PROPRIETOR_BY_ID)
	public ResponseEntity<ProprietorDTO> getProprietorById(@PathVariable("id") Long id)
	{
		ProprietorDTO proprietorResponse = proprietorService.getProprietorById(id);
		return new ResponseEntity<>(proprietorResponse, HttpStatus.OK);
	}
	
	@PostMapping(value = Constants.FETCH_PROPRIETOR_BY_NAME_OR_PHONE_NO)
	public ResponseEntity<List<ProprietorDTO>> getProprietorByNameOrPhone(@PathVariable("search-value") String searchValue, @RequestBody PagingAndSortingDTO pagingAndSortingDTO)
	{
		List<ProprietorDTO> proprietorResponseList = proprietorService.getProprietorByNameOrPhone(searchValue, pagingAndSortingDTO);
		return new ResponseEntity<>(proprietorResponseList, HttpStatus.OK);
	}
}
