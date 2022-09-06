package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.entity.Car;
import com.car.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository carrepo;
	

	public void deleteCar(int id) {
		carrepo.deleteById(id);
		
	}

	public List<Car> getAllCars() {
		
		
		return carrepo.findAll();
	}

	public Car saveCar(Car car) {
	
		return carrepo.save(car);
	}

	
	public void updateCar(Car car) {
		 carrepo.save(car);
		
	}	

}
