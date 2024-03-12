package com.example.nxtstayz.repository;

import java.util.ArrayList;
import com.example.nxtstayz.model.Room;

public interface RoomRepository {
    ArrayList<Room> getRooms();

    Room getRoomById(int roomId);

    Room addRoom(Room room);

    Room updateRoom(int roomId, Room room);

    void deleteRoom(int roomId);

}
