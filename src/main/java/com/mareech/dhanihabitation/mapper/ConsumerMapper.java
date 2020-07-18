package com.mareech.dhanihabitation.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mareech.dhanihabitation.dto.ConsumerDTO;
import com.mareech.dhanihabitation.model.BloodGroup;
import com.mareech.dhanihabitation.model.Consumer;
import com.mareech.dhanihabitation.model.Room;
import com.mareech.dhanihabitation.repository.BloodGroupRepository;
import com.mareech.dhanihabitation.repository.ConsumerRepository;
import com.mareech.dhanihabitation.repository.RoomRepository;

@Component
public class ConsumerMapper implements AbstractMapper<ConsumerDTO, Consumer>{

	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	ConsumerRepository consumerRepository;
	
	@Autowired
	RoomRepository roomRepository;
	
	@Autowired
	BloodGroupRepository bloodGroupRepository;
	
	@Override
	public ConsumerDTO modelToDTOMap(Consumer model) 
	{
		ConsumerDTO dtoObject =  modelMapper.map(model, ConsumerDTO.class);
		dtoObject.setRoomId(model.getRoom() != null ? model.getRoom().getId() : null);
		dtoObject.setRoomNo(model.getRoom() != null ? model.getRoom().getRoomNumber() : null);
		dtoObject.setBloodGroupId(model.getBloodGroup() != null ? model.getBloodGroup().getId() : null);
		dtoObject.setBloodGroupName(model.getBloodGroup() != null ? model.getBloodGroup().getName() : null);		
		
		return dtoObject;
	}

	@Override
	public Consumer dtoToModelMap(ConsumerDTO dto) 
	{
		 Consumer consumer = modelMapper.map(dto, Consumer.class);
		 Optional<Room> roomObj = roomRepository.findById(dto.getRoomId());
		 if (roomObj.isPresent()) 
		 {
			 consumer.setRoom(roomObj.get());
		 }
		 
		 Optional<BloodGroup> bloodGroupObj = bloodGroupRepository.findById(dto.getBloodGroupId());
		 if(bloodGroupObj.isPresent())
		 {
			 consumer.setBloodGroup(bloodGroupObj.get());
		 }
		 
		 return consumer;
	}

	@Override
	public List<ConsumerDTO> modelToDTOList(List<Consumer> modelList) 
	{
		List<ConsumerDTO> consumerDTOList = new ArrayList<>();
		modelList.forEach(el -> {
			ConsumerDTO consumerDTO = new ConsumerDTO();
			
			consumerDTO.setRoomId(el.getRoom() != null ? el.getRoom().getId() : null);
			consumerDTO.setRoomNo(el.getRoom() != null ? el.getRoom().getRoomNumber() : null);
			consumerDTO.setBloodGroupId(el.getBloodGroup() != null ? el.getBloodGroup().getId() : null);
			consumerDTO.setBloodGroupName(el.getBloodGroup() != null ? el.getBloodGroup().getName() : null);
			consumerDTO.setFirstName(el.getFirstName());
			consumerDTO.setLastName(el.getLastName());
			consumerDTO.setContactNumber(el.getContactNumber());
			consumerDTO.setEmail(el.getEmail());
			consumerDTO.setAddress(el.getAddress());
			consumerDTO.setPincode(el.getPincode());
			consumerDTO.setOccupation(el.getOccupation());
			consumerDTO.setDateOfJoining(el.getDateOfJoining());
			consumerDTO.setDateOfRelieving(el.getDateOfRelieving());
			consumerDTO.setMonthlyRentAmount(el.getMonthlyRentAmount());
			consumerDTO.setDepositAmount(el.getDepositAmount());
			consumerDTO.setActiveStatus(el.getActiveStatus());
			consumerDTO.setGaurdianName(el.getGaurdianName());
			consumerDTO.setGaurdianContactNumber(el.getGaurdianContactNumber());
			
			consumerDTOList.add(consumerDTO);
		});
		return consumerDTOList;
	}

	@Override
	public List<Consumer> dtoToModelList(List<ConsumerDTO> dtoList) 
	{
		List<Consumer> consumers = new ArrayList<>();
		dtoList.forEach(el -> {
			Consumer consumer = new Consumer();
			
			consumer.setRoom(roomRepository.findById(el.getRoomId()).get());
			consumer.setBloodGroup(bloodGroupRepository.findById(el.getRoomId()).get());
			consumer.setFirstName(el.getFirstName());
			consumer.setLastName(el.getLastName());
			consumer.setContactNumber(el.getContactNumber());
			consumer.setEmail(el.getEmail());
			consumer.setAddress(el.getAddress());
			consumer.setPincode(el.getPincode());
			consumer.setOccupation(el.getOccupation());
			consumer.setDateOfJoining(el.getDateOfJoining());
			consumer.setDateOfRelieving(el.getDateOfRelieving());
			consumer.setMonthlyRentAmount(el.getMonthlyRentAmount());
			consumer.setDepositAmount(el.getDepositAmount());
			consumer.setActiveStatus(el.getActiveStatus());
			consumer.setGaurdianName(el.getGaurdianName());
			consumer.setGaurdianContactNumber(el.getGaurdianContactNumber());
			
			consumers.add(consumer);
		});
		return consumers;
	}
}
