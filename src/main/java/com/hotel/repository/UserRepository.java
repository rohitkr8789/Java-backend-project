package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query method
    User findByEmail(String email);
}

