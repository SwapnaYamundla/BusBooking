package com.busbooking;

import java.sql.Time;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.booking.config.EBookingConfiguaration;
import com.booking.dao.BookingDetailsDao;
import com.booking.model.BookingDetails;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(EBookingConfiguaration.class);
        BookingDetailsDao bookingdetailsdao=context.getBean(BookingDetailsDao.class);
        BookingDetails bookingdetails=new BookingDetails();
        bookingdetails.setBookingid(1);
        bookingdetails.setBookingtime(Time.valueOf("12:00:00"));
        bookingdetails.setBustype("Super luxury");
        bookingdetails.setPrice(320);
        bookingdetails.setUsername("aravind");
        bookingdetailsdao.addDetails(bookingdetails);
    }
}
