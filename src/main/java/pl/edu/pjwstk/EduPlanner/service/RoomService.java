package pl.edu.pjwstk.EduPlanner.service;

import org.springframework.stereotype.Service;
import pl.edu.pjwstk.EduPlanner.domain.Room;
import pl.edu.pjwstk.EduPlanner.repository.RoomRepository;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(Long id, Room updatedRoom) {
        return roomRepository.findById(id)
                .map(existingRoom -> {
                    existingRoom.setName(updatedRoom.getName());
                    return roomRepository.save(existingRoom);
                })
                .orElse(null);
    }

    public boolean deleteRoom(Long id) {
        if (roomRepository.existsById(id)) {
            roomRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
