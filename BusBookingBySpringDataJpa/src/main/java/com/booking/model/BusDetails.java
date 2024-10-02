package com.booking.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bus_Details")
public class BusDetails {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="bus_number",nullable=false)
private Integer busNum;
@Column(name="booked_date",nullable=false)
private Date bookeddate;
@Column(name="Destination",nullable=false)
private String destination;
@Column(name="bus_time",nullable=false)
private Time busttime;
public BusDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public BusDetails(int busNum, Date bookeddate, String destination, Time busttime) {
	super();
	this.busNum = busNum;
	this.bookeddate = bookeddate;
	this.destination = destination;
	this.busttime = busttime;
}
public Integer getBusNum() {
	return busNum;
}
public void setBusNum(int busNum) {
	this.busNum = busNum;
}
public Date getBookeddate() {
	return bookeddate;
}
public void setBookeddate(Date bookeddate) {
	this.bookeddate = bookeddate;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public Time getBustTime() {
	return busttime;
}
public void setBustTime(Time bustTime) {
	this.busttime = bustTime;
}
@Override
public String toString() {
	return "BusDetails [busNum=" + busNum + ", bookeddate=" + bookeddate + ", destination=" + destination
			+ ", bustTime=" + busttime + "]";
}

}
