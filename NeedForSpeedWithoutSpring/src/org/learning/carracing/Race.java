package org.learning.carracing;

public class Race {	//Does not need know which car
	
	private Car car;
	
	
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
