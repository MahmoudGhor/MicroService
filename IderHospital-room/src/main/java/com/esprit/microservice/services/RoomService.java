package com.esprit.microservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.models.Room;
import com.esprit.microservice.models.Ward;
import com.esprit.microservice.repositories.RoomRepository;
import com.esprit.microservice.repositories.WardRepository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	@Autowired
	private WardRepository wardRepository;
	
	public Room addRoom(Room room) {
		return roomRepository.save(room);
	}
	
	public Room addRoomByWard(int id, Room room) {
		Ward ward = wardRepository.findById(id).get();
		room.setWard(ward);
		return roomRepository.save(room);
	}
	
	public Room updateRoom(int id, Room newRoom) {
		if (roomRepository.findById(id).isPresent()) {
			Room existingRoom = roomRepository.findById(id).get();
			existingRoom.setRoom_number(newRoom.getRoom_number());
			return roomRepository.save(existingRoom);

		} else {
			return null;
		}
	}
	
	public String deleteRoom(int id) {
		if (roomRepository.findById(id).isPresent()) {
			roomRepository.deleteById(id);
			return "room deleted";
		} else {
			return "room not deleted";
		}
	}

}
