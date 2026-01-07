package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.entity.Booking;
import com.hotel.entity.User;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    // Find bookings of a user
    List<Booking> findByUser(User user);

    // Find bookings by status
    List<Booking> findByStatus(String status);
}

