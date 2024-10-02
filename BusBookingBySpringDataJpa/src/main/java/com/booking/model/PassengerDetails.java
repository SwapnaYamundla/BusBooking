package com.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="passengers_det")
public class PassengerDetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="booking_id",nullable=false)
private Integer bookingid;
@Column(name="passenger_name",nullable=false)
private String name;
@Column(name="mobile_num",nullable=false)
private long mobilenum;
@Column(name="maild_id",nullable=false)
private String mail;

public PassengerDetails() {
	super();
	// TODO Auto-generated constructor stub
}


public PassengerDetails(int bookingid, String name, long mobilenum, String mail) {
	super();
	this.bookingid = bookingid;
	this.name = name;
	this.mobilenum = mobilenum;
	this.mail = mail;
}


public Integer getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobilenum() {
	return mobilenum;
}
public void setMobilenum(long mobilenum) {
	this.mobilenum = mobilenum;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}


@Override
public String toString() {
	return "PassengerDetails [bookingid=" + bookingid + ", name=" + name + ", mobilenum=" + mobilenum + ", mail=" + mail
			+ "]";
}


}
