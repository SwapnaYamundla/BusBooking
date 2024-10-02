package com.booking.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking_details")
public class BookingDetails {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private 	Integer bookingid;
@Column(name="user_name",nullable=false)
private String username;
@Column(name="booking_time",nullable=false)
private Time bookingtime;
@Column(name="bus_type",nullable=false)
private String bustype;
@Column(name="Price",nullable=false)
private double price;
public BookingDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public BookingDetails(int bookingid, String username, Time bookingtime, String bustype, double price) {
	super();
	this.bookingid = bookingid;
	this.username = username;
	this.bookingtime = bookingtime;
	this.bustype = bustype;
	this.price = price;
}
public Integer getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Time getBookingtime() {
	return bookingtime;
}
public void setBookingtime(Time bookingtime) {
	this.bookingtime = bookingtime;
}
public String getBustype() {
	return bustype;
}
public void setBustype(String bustype) {
	this.bustype = bustype;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "BookingDetails [bookingid=" + bookingid + ", username=" + username + ", bookingtime=" + bookingtime
			+ ", bustype=" + bustype + ", price=" + price + "]";
}

}
