package com.nakul.se_all_spring_annotations;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
//same way- ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("beans.xml file loaded");
		College college = context.getBean("collegeBean",College.class); 
		college.test();
		context.close(); 

	}

}
