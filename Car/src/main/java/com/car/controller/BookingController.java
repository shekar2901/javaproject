package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.entity.CarBooking;
import com.car.service.BookingServiceImpl;

@RestController
@RequestMapping("/carbooking")
public class BookingController {
	
	@Autowired
	private BookingServiceImpl bookimpl;

	@PostMapping
	public void doBooking(@RequestBody CarBooking carBooking) {
		bookimpl.confirmBooking(carBooking);
		
	}
	@GetMapping("/getById/{id}")
	public CarBooking BookingById(int id) {
		
		return bookimpl.getBooking(id);
	
	}
	@GetMapping("/ getall")
	public List<CarBooking> getAll(){
		return bookimpl.getAllBookings();
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteBooking(int id) {
		 bookimpl.deleteBooking(id);
		
	}
}
