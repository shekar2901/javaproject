package com.car.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="car")
@Data
public class Car {
	
	@Id
	@Column(name="car_id")
	private int carId;
	@Column(name="car_name")
	private String carName;
	@Column(name="car_number")
	private int carNumber;
	@Column(name="placeid")
	private int placeId;
	@Column(name="from_location")
	private String fromLocation;
	@Column(name="to_location")
	private String toLocation;
	@Column(name="price")
	private long price;
	@Column(name="travel_id")
	private int travelId;
	
	public Car() {
		
	}
	public Car(int carId, String carName, int carNumber, int placeId, String fromLocation, String toLocation,
			long price, int travelId) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carNumber = carNumber;
		this.placeId = placeId;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.price = price;
		this.travelId = travelId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public int getPlaceId() {
		return placeId;
	}
	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getTravelId() {
		return travelId;
	}
	public void setTravelId(int travelId) {
		this.travelId = travelId;
	}
	
	

}
