package com.learning.annotation.org.learning.carracing.car;

import org.springframework.stereotype.Component;

@Component("jjjjj")		//created bean with id="jaguar"
public class Jaguar implements RacingCar {

	public void startEngine() {
		System.out.println("Start Engine of Jaguar");
		
	}

	public void acclerate() {
		System.out.println("Fast your Jaguar and Go to win");
		
	}
	
}
