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
import com.mareech.dhanihabitation.dto.UnitDTO;
import com.mareech.dhanihabitation.service.UnitService;

@RestController
@RequestMapping(value = Constants.API_END_POINT)
public class UnitController {

	@Autowired
	UnitService unitService;
	
	@PostMapping(value = Constants.FETCH_UNITS)
	public ResponseEntity<List<UnitDTO>> getAllUnits(@RequestBody PagingAndSortingDTO pagingAndSortingDTO) 
	{
		List<UnitDTO> units = unitService.getAllUnits(pagingAndSortingDTO);
		return new ResponseEntity<>(units, HttpStatus.OK);
	}
	
	@PostMapping(value = Constants.SAVE_AND_UPDATE_UNIT)
	public ResponseEntity<UnitDTO> saveProprietor(@RequestBody UnitDTO unitDTO)
	{
		UnitDTO unitResponse = unitService.saveAndUpdateUnit(unitDTO);
		return new ResponseEntity<>(unitResponse, HttpStatus.OK);
	}
	
	@GetMapping(value = Constants.FETCH_UNIT_BY_ID)
	public ResponseEntity<UnitDTO> getUnitById(@PathVariable("id") Long id)
	{
		UnitDTO unitResponse = unitService.getUnitById(id);
		return new ResponseEntity<>(unitResponse, HttpStatus.OK);
	}
	
	@PostMapping(value = Constants.FETCH_UNIT_BY_TYPE)
	public ResponseEntity<List<UnitDTO>> getUnitByType(@PathVariable("type") Long type,  @RequestBody PagingAndSortingDTO pagingAndSortingDTO)
	{
		List<UnitDTO> unitResponse = unitService.getUnitByType(type, pagingAndSortingDTO);
		return new ResponseEntity<>(unitResponse, HttpStatus.OK);
	}
	
	@PostMapping(value = Constants.FETCH_UNIT_BY_PROPRIETOR_BY_ID)
	public ResponseEntity<List<UnitDTO>> getUnitByProprietorId(@PathVariable("id") Long id,  @RequestBody PagingAndSortingDTO pagingAndSortingDTO)
	{
		List<UnitDTO> unitResponse = unitService.getUnitByProprietoryId(id, pagingAndSortingDTO);
		return new ResponseEntity<>(unitResponse, HttpStatus.OK);
	}
}
