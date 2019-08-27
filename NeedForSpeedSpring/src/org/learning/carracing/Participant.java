package org.learning.carracing;

public class Participant {
	public static void main(String args[]) {
		//Choose your car
		
		Car ferrari = new Ferrari();
		Car jaguar = new Jaguar();
		// Ford
		// McLaren
		
		
		// Who will create for us?
		// When????
		// When to destroy the object
		// How to inject the dependency
		
		//IoC container	// provided by Spring Framework
		
		
		
		Race r = new Race();	
		r.setCar(jaguar);	//Injected the dependency
							//through setter method
		r.startRace();
		
		Race r2 = new Race(ferrari);	//Injected the dependency
										//through the constructor
		
		r2.startRace();
		
		
	}
}
