package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hotel.entity.Booking;
import com.hotel.entity.User;
import com.hotel.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // Create booking
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    // Get bookings of a user
    @PostMapping("/user")
    public List<Booking> getBookingsByUser(@RequestBody User user) {
        return bookingService.getBookingsByUser(user);
    }
}
