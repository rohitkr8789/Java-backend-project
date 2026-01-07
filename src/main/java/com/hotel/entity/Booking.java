package com.hotel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    private String status; // BOOKED, CANCELLED

    // Many bookings → One user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Many bookings → One room
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

   
}
