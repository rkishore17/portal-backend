package com.mareech.dhanihabitation.service;

import java.util.List;

import com.mareech.dhanihabitation.dto.ConsumerDTO;

public interface ConsumerService {
	
	public ConsumerDTO saveAndUpdateConsumer(ConsumerDTO consumerDTO);
	public ConsumerDTO getConsumerById(Long id);
	public List<ConsumerDTO> getConsumerByRoom(Long id);
}