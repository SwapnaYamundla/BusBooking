package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.model.PassengerDetails;

public interface PassengeRepositoty extends JpaRepository<PassengerDetails, Integer>{

}
