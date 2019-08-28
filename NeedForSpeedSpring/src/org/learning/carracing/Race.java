package org.learning.carracing;

import org.learning.carracing.car.RacingCar;
import org.learning.carracing.car.SimpleCar;

public class Race {	//Does not need know which car
	
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
