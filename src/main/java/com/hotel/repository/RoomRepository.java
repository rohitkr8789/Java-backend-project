package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.entity.Room;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    // Find rooms by type
    List<Room> findByType(String type);

    // Find available rooms
    List<Room> findByAvailable(Boolean available);
}
