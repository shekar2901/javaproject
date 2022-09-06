package com.car.service;

import java.util.List;

import com.car.entity.Car;



public interface CarService {
	public Car saveCar(Car car);
	void updateCar(Car car);
	void deleteCar(int ById);
	List<Car> getAllCars();
}
