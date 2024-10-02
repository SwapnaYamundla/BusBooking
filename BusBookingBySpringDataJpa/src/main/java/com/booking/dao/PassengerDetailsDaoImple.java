package com.booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.booking.model.PassengerDetails;
import com.booking.repository.PassengeRepositoty;
@Component
public class PassengerDetailsDaoImple implements PassengerDetailsDao{
@Autowired
PassengeRepositoty passengerRepository;
	@Override
	public void addDetails(PassengerDetails details) {
	PassengerDetails details1=passengerRepository.save(details);
	System.out.println(details1);
		
	}

}
