package com.esprit.microservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.models.OperatingRoom;
import com.esprit.microservice.repositories.OperatingRoomRepository;
@Service
public class OperatingRoomService {
	
	@Autowired
	private OperatingRoomRepository OperatingRoomRepository;
	
	public OperatingRoom addOperatingRoom(OperatingRoom OperatingRoom) {
		return OperatingRoomRepository.save(OperatingRoom);
	}
	
	public OperatingRoom updateOperatingRoom(int id, OperatingRoom newOperatingRoom) {
		if (OperatingRoomRepository.findById(id).isPresent()) {
			OperatingRoom existingOperatingRoom = OperatingRoomRepository.findById(id).get();
			existingOperatingRoom.setNumber(newOperatingRoom.getNumber());
			return OperatingRoomRepository.save(existingOperatingRoom);

		} else {
			return null;
		}
	}
	
	public String deleteOperatingRoom(int id) {
		if (OperatingRoomRepository.findById(id).isPresent()) {
			OperatingRoomRepository.deleteById(id);
			return "OperatingRoom deleted";
		} else {
			return "OperatingRoom not deleted";
		}
	}

}
