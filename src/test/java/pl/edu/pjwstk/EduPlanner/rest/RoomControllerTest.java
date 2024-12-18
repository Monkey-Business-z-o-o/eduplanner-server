package pl.edu.pjwstk.EduPlanner.rest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import pl.edu.pjwstk.EduPlanner.domain.Room;
import pl.edu.pjwstk.EduPlanner.service.RoomService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RoomControllerTest {

    @Mock
    private RoomService roomService;

    @InjectMocks
    private RoomController roomController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllRooms_ShouldReturnListOfRooms() {
        // Arrange
        Room room1 = new Room(1L, "Room A");
        Room room2 = new Room(2L, "Room B");
        List<Room> mockRooms = Arrays.asList(room1, room2);

        when(roomService.getAllRooms()).thenReturn(mockRooms);

        // Act
        List<Room> rooms = roomController.getAllRooms();

        // Assert
        assertNotNull(rooms);
        assertEquals(2, rooms.size());
        verify(roomService, times(1)).getAllRooms();
    }

    @Test
    void getRoomById_ShouldReturnRoom_WhenRoomExists() {
        // Arrange
        Room room = new Room(1L, "Room A");
        when(roomService.getRoomById(1L)).thenReturn(room);

        // Act
        ResponseEntity<Room> response = roomController.getRoomById(1L);

        // Assert
        assertEquals(200, response.getStatusCodeValue());
        assertNotNull(response.getBody());
        assertEquals("Room A", response.getBody().getName());
        verify(roomService, times(1)).getRoomById(1L);
    }

    @Test
    void getRoomById_ShouldReturnNotFound_WhenRoomDoesNotExist() {
        // Arrange
        when(roomService.getRoomById(1L)).thenReturn(null);

        // Act
        ResponseEntity<Room> response = roomController.getRoomById(1L);

        // Assert
        assertEquals(404, response.getStatusCodeValue());
        assertNull(response.getBody());
        verify(roomService, times(1)).getRoomById(1L);
    }

    @Test
    void createRoom_ShouldReturnCreatedRoom() {
        // Arrange
        Room room = new Room(null, "Room A");
        Room createdRoom = new Room(1L, "Room A");
        when(roomService.createRoom(room)).thenReturn(createdRoom);

        // Act
        ResponseEntity<Room> response = roomController.createRoom(room);

        // Assert
        assertEquals(200, response.getStatusCodeValue());
        assertNotNull(response.getBody());
        assertEquals(1L, response.getBody().getId());
        verify(roomService, times(1)).createRoom(room);
    }

    @Test
    void updateRoom_ShouldReturnUpdatedRoom_WhenRoomExists() {
        // Arrange
        Room updatedRoom = new Room(1L, "Updated Room A");
        when(roomService.updateRoom(1L, updatedRoom)).thenReturn(updatedRoom);

        // Act
        ResponseEntity<Room> response = roomController.updateRoom(1L, updatedRoom);

        // Assert
        assertEquals(200, response.getStatusCodeValue());
        assertNotNull(response.getBody());
        assertEquals("Updated Room A", response.getBody().getName());
        verify(roomService, times(1)).updateRoom(1L, updatedRoom);
    }

    @Test
    void updateRoom_ShouldReturnNotFound_WhenRoomDoesNotExist() {
        // Arrange
        Room updatedRoom = new Room(1L, "Updated Room A");
        when(roomService.updateRoom(1L, updatedRoom)).thenReturn(null);

        // Act
        ResponseEntity<Room> response = roomController.updateRoom(1L, updatedRoom);

        // Assert
        assertEquals(404, response.getStatusCodeValue());
        assertNull(response.getBody());
        verify(roomService, times(1)).updateRoom(1L, updatedRoom);
    }

    @Test
    void deleteRoom_ShouldReturnNoContent_WhenRoomIsDeleted() {
        // Arrange
        when(roomService.deleteRoom(1L)).thenReturn(true);

        // Act
        ResponseEntity<Void> response = roomController.deleteRoom(1L);

        // Assert
        assertEquals(204, response.getStatusCodeValue());
        verify(roomService, times(1)).deleteRoom(1L);
    }

    @Test
    void deleteRoom_ShouldReturnNotFound_WhenRoomDoesNotExist() {
        // Arrange
        when(roomService.deleteRoom(1L)).thenReturn(false);

        // Act
        ResponseEntity<Void> response = roomController.deleteRoom(1L);

        // Assert
        assertEquals(404, response.getStatusCodeValue());
        verify(roomService, times(1)).deleteRoom(1L);
    }
}
