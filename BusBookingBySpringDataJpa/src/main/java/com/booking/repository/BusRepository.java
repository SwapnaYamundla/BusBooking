package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.model.BusDetails;

public interface BusRepository extends JpaRepository<BusDetails, Integer>{

}
