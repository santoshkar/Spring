package com.learning.annotation.org.learning.carracing.car;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component		//created bean with id="jaguar"
@Primary
public class Jaguar implements RacingCar {

	public void startEngine() {
		System.out.println("Start Engine of Jaguar");
		
	}

	public void acclerate() {
		System.out.println("Fast your Jaguar and Go to win");
		
	}
	
}
