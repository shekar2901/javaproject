package com.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.entity.CarBooking;

public interface BookingRepository extends JpaRepository<CarBooking,Integer> {

}
