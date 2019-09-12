package com.learning.annotation.org.learning.carracing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component			// -> Spring will create a bean with id "race"
public class Race {	//Does not need know which car
	
	@Autowired
	private Car car;			//name is car
								//type is Car (.class)
	public Race(Car car) {
		this.car = car;
	}
	
	public Race() {
	}
	
	public void setCar(Car car) {	//Setter method
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}

	public void startRace() {	//Business Logic
		car.startEngine();
		car.acclerate();
	}
	
}
