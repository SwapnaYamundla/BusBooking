package com.booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.booking.model.BookingDetails;
import com.booking.repository.BookingRepository;
@Component
public class BookingDetailsDaoImple implements BookingDetailsDao{
@Autowired
BookingRepository bookingRepository;
	@Override
	public void addDetails(BookingDetails booking) {
		BookingDetails details=bookingRepository.save(booking);
		System.out.println(details);
		
	}

}
