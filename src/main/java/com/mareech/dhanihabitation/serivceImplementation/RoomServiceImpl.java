package com.mareech.dhanihabitation.serivceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mareech.dhanihabitation.dto.FilterDTO;
import com.mareech.dhanihabitation.dto.RoomDTO;
import com.mareech.dhanihabitation.mapper.RoomMapper;
import com.mareech.dhanihabitation.model.Room;
import com.mareech.dhanihabitation.repository.AmenitiesRepository;
import com.mareech.dhanihabitation.repository.RoomRepository;
import com.mareech.dhanihabitation.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	RoomRepository roomRepository;
	
	@Autowired
	RoomMapper roomMapper;
	
	@Autowired
	AmenitiesRepository amenityRepository;

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

	
	@Override
	public List<RoomDTO> findByFilterCriteria(FilterDTO filterDTO) {
		try {
			List<Room> room = roomRepository.getFilterCriteria(filterDTO.getUnits(), filterDTO.getSharingType(), filterDTO.getAmenities());
			return roomMapper.modelToDTOList(room);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}	
}
