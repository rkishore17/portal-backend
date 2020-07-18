package com.mareech.dhanihabitation.service;

import com.mareech.dhanihabitation.dto.RoomDTO;

public interface RoomService {
	public RoomDTO saveAndUpdateRoom(RoomDTO roomDTO);
	public RoomDTO getRoomById(Long id);
	
//	public List<RoomDTO> findByFilterCriteria(FilterDTO filterDTO);
}
