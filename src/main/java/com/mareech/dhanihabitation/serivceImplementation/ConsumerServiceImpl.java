package com.mareech.dhanihabitation.serivceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mareech.dhanihabitation.dto.ConsumerDTO;
import com.mareech.dhanihabitation.mapper.ConsumerMapper;
import com.mareech.dhanihabitation.model.Consumer;
import com.mareech.dhanihabitation.model.Room;
import com.mareech.dhanihabitation.repository.ConsumerRepository;
import com.mareech.dhanihabitation.repository.RoomRepository;
import com.mareech.dhanihabitation.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService{

	@Autowired
	ConsumerRepository consumerRepository;
	
	@Autowired
	RoomRepository roomRepository;
	
	@Autowired
	ConsumerMapper consumerMapper;
	
	@Override
	public ConsumerDTO saveAndUpdateConsumer(ConsumerDTO consumerDTO) 
	{
		try {
			 Consumer consumerModel = consumerRepository.saveAndFlush(consumerMapper.dtoToModelMap(consumerDTO));
			 return consumerMapper.modelToDTOMap(consumerModel);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public ConsumerDTO getConsumerById(Long id) 
	{
		try {
			Optional<Consumer> consumerModel = consumerRepository.findById(id);
			if(consumerModel.isPresent())
			{
				return consumerMapper.modelToDTOMap(consumerModel.get());				
			}
			return null;
		} catch (Exception e) {
			 throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public List<ConsumerDTO> getConsumerByRoom(Long id) 
	{
		try {
			List<Consumer> consumer = new ArrayList<>();
			Optional<Room> room = roomRepository.findById(id);
			if(room.isPresent())
			{
				consumer = consumerRepository.findByRoom(room.get());
			}
			return consumerMapper.modelToDTOList(consumer);
		} catch (Exception e) {
			 throw new RuntimeException(e.getMessage());
		}
	}
}
