package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.entity.Car;
import com.car.service.CarServiceImpl;

@RestController
@RequestMapping("/car")
public class CarController {
	
	
	@Autowired
	private CarServiceImpl carimpl;

	@PostMapping("/add")
	public Car saveCar(@RequestBody Car car) {
		
		return carimpl.saveCar(car);
	}
	
	@PutMapping("/update")
	public void updateCar(Car car) {
		carimpl.updateCar(car);
	}
	
	@DeleteMapping("/delete")
	public int deleteById(int id) {
		carimpl.deleteCar(id);
		return id;
		
	}
	@GetMapping("/all")
	public List<Car> getAllCars(){
		
		return carimpl.getAllCars();
	}
	
}
