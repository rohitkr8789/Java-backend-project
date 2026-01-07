package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Booking;
import com.hotel.entity.Room;
import com.hotel.entity.User;
import com.hotel.repository.BookingRepository;
import com.hotel.repository.RoomRepository;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RoomRepository roomRepository;

    // Create booking
    public Booking createBooking(Booking booking) {

        Room room = booking.getRoom();

        // Business rule: room must be available
        if (!room.getAvailable()) {
            throw new RuntimeException("Room is not available");
        }

        // Mark room as unavailable
        room.setAvailable(false);
        roomRepository.save(room);

        booking.setStatus("BOOKED");

        return bookingRepository.save(booking);
    }

    // Get bookings of a user
    public List<Booking> getBookingsByUser(User user) {
        return bookingRepository.findByUser(user);
    }
}
