package com.nakul.SpringPractice;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	public void drive()
	{
		System.out.println("In a driving mode");
	}

}
