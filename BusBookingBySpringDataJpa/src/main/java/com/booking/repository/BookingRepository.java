package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.model.BookingDetails;

public interface BookingRepository extends JpaRepository<BookingDetails, Integer>{

}
