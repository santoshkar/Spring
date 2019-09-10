package com.learning.annotation.org.learning.carracing.car;

import org.springframework.stereotype.Component;

import com.learning.annotation.org.learning.carracing.Car;

@Component
public class Ferrari implements Car {

	public void startEngine() {
		System.out.println("Start Engine of Ferrari");
		
	}

	public void acclerate() {
		System.out.println("Fast your ferrari and Go to win");
		
	}

}


