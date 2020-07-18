package com.mareech.dhanihabitation.controller;

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
import com.mareech.dhanihabitation.dto.RoomDTO;
import com.mareech.dhanihabitation.service.RoomService;

@RestController
@RequestMapping(value = Constants.API_END_POINT)
public class RoomController {
	
	@Autowired
	RoomService roomService;

	@PostMapping(value = Constants.SAVE_AND_UPDATE_ROOM)
	public ResponseEntity<RoomDTO> saveRoom(@RequestBody RoomDTO roomDTO)
	{
		RoomDTO roomResponse = roomService.saveAndUpdateRoom(roomDTO);
		return new ResponseEntity<>(roomResponse, HttpStatus.OK);
	}
	
	@GetMapping(value = Constants.FETCH_ROOM_BY_ID)
	public ResponseEntity<RoomDTO> getRoomById(@PathVariable("id") Long id)
	{
		RoomDTO roomResponse = roomService.getRoomById(id);		
		return new ResponseEntity<>(roomResponse, HttpStatus.OK);
	}
}
