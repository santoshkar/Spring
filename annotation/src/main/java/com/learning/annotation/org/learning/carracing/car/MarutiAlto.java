package com.learning.annotation.org.learning.carracing.car;

import org.springframework.stereotype.Component;

@Component
public class MarutiAlto implements SimpleCar {

	public void startEngine() {
		System.out.println("Start Engine of Car");
		
	}

	public void acclerate() {
		System.out.println("Don't race, just go to office");
	}
	
}
