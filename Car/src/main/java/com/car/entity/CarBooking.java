package com.car.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="car_booking")
public class CarBooking {

	@Id
	@Column(name="booking_id")
	private int bookingId;
	@Column(name="user_id")
	private int userId;
	@Column(name="car_id")
	@OneToMany()
	private int carID;
	@Column(name="booking_date")
	private Date bookingDate;
	
	public CarBooking() {
		
	}
	public CarBooking(int bookingId, int userId, int carID, Date bookingDate) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.carID = carID;
		this.bookingDate = bookingDate;
	}


	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCarID() {
		return carID;
	}
	public void setCarID(int carID) {
		this.carID = carID;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
	
}
