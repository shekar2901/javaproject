package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.entity.CarBooking;
import com.car.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository bookRepo;
	
	public void confirmBooking(CarBooking carBooking) {
		bookRepo.save(carBooking);
		
	}

	public List<CarBooking> getAllBookings() {
		
		return bookRepo.findAll();
	}
	
	public void deleteBooking(int id) {
	bookRepo.deleteById(id);
		
	}
	
	public CarBooking getBooking(int id) {
		
		return bookRepo.getById(id);
	}

}
