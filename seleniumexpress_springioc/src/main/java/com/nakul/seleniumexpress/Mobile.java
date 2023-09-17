//selenium express spring ioc eg
package com.nakul.seleniumexpress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		/*Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();*/
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim = (Sim) context.getBean("sim");
		
		sim.calling();
		sim.data();
		
		
		


	}



}
