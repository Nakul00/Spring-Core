//dependency injection using setter injection
//other way is constructor injection where xml-property replace by constructor-arg
//and in Student class remove setter method and add constructor
package com.nakul.selenium_depen_injec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stud = context.getBean("student", Student.class);
		stud.displayName();
		
		Student god = context.getBean("shiv", Student.class);
		god.displayName();
		

	}

}
