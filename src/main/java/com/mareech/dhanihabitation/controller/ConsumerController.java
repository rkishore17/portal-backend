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
import com.mareech.dhanihabitation.dto.ConsumerDTO;
import com.mareech.dhanihabitation.service.ConsumerService;

@RestController
@RequestMapping(value = Constants.API_END_POINT)
public class ConsumerController {

	@Autowired
	ConsumerService consumerService;
	
	@PostMapping(value = Constants.SAVE_AND_UPDATE_CONSUMER)
	public ResponseEntity<ConsumerDTO> saveConsumer(@RequestBody ConsumerDTO consumerDTO)
	{
		ConsumerDTO consumerResponse = consumerService.saveAndUpdateConsumer(consumerDTO);
		return new ResponseEntity<>(consumerResponse, HttpStatus.OK);
	}
	
	@GetMapping(value = Constants.FETCH_CONSUMER_BY_ID)
	public ResponseEntity<ConsumerDTO> getConsumerById(@PathVariable("id") Long id)
	{
		ConsumerDTO consumerResponse = consumerService.getConsumerById(id);
		return new ResponseEntity<>(consumerResponse, HttpStatus.OK);
	}
	
	@GetMapping(value = Constants.FETCH_CONSUMER_BY_ROOM_ID)
	public ResponseEntity<List<ConsumerDTO>> getConsumerByRoom(@PathVariable("room-id") Long id)
	{
		List<ConsumerDTO> consumerResponse = consumerService.getConsumerByRoom(id);
		return new ResponseEntity<>(consumerResponse, HttpStatus.OK);
	}
}
