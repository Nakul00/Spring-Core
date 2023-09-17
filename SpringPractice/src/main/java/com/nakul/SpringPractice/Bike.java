package com.nakul.SpringPractice;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	public void drive()
	{
		System.out.println("In a bike race");
	}

}
