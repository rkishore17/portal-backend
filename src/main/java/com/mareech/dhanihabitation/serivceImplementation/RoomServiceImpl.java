package com.mareech.dhanihabitation.serivceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mareech.dhanihabitation.dto.RoomDTO;
import com.mareech.dhanihabitation.mapper.RoomMapper;
import com.mareech.dhanihabitation.model.Room;
import com.mareech.dhanihabitation.repository.RoomRepository;
import com.mareech.dhanihabitation.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	RoomRepository roomRepository;
	
	@Autowired
	RoomMapper roomMapper;

	@Override
	public RoomDTO saveAndUpdateRoom(RoomDTO roomDTO) 
	{
		try {
			Room room = roomRepository.saveAndFlush(roomMapper.dtoToModelMap(roomDTO));
			return roomMapper.modelToDTOMap(room);
		} catch (Exception e) {
			 throw new RuntimeException();
		}
	}

	@Override
	public RoomDTO getRoomById(Long id)
	{
		try {
			Optional<Room> roomResponse = roomRepository.findById(id);
			if (roomResponse.isPresent()) 
			{
				return roomMapper.modelToDTOMap(roomResponse.get());
			}
			return null;
		} catch (Exception e) {
			 throw new RuntimeException();
		}
	}
}
