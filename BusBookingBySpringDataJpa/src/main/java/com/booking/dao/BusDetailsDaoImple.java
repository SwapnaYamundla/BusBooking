package com.booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.booking.model.BusDetails;
import com.booking.repository.BusRepository;
@Component
public class BusDetailsDaoImple implements BusDetailsDao{
@Autowired
BusRepository busRepository;
	@Override
	public void addDetails(BusDetails details) {
		BusDetails details1=busRepository.save(details);
		System.out.println(details1);
	}

}
