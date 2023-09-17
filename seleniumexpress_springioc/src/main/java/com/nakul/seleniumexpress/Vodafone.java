package com.nakul.seleniumexpress;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("calling using Vodafone");
		
	}

	@Override
	public void data() {
		System.out.println("browsing uisng Vodafone");
		
	}

}
