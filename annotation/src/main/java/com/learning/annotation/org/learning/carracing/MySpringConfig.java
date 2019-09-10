package com.learning.annotation.org.learning.carracing;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Tell Spring that this is the config class to read
@Configuration
@ComponentScan(basePackages = {"com.learning.annotation.*"})
public class MySpringConfig {
	
	
	
//	@Bean
//	Race race() {
//		return new Race();
//	}
}


