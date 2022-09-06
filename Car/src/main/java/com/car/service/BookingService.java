package com.car.service;

import java.util.List;

import com.car.entity.CarBooking;

public interface BookingService {

	public void confirmBooking(CarBooking carBooking);
	public CarBooking getBooking(int id);
	public List<CarBooking> getAllBookings();
	public void deleteBooking(int id);
}
