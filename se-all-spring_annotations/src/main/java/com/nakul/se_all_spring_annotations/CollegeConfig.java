package com.nakul.se_all_spring_annotations;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.nakul.se_all_spring_annotations")
public class CollegeConfig {
	
	
	@Bean
	public College collegeBean()  //collegeBean - bean id
	{
		College college = new College(principalBean());
		college.setTeacher(mathTaeacherBean());
		return college;
	}
	
	@Bean
	public Principal principalBean()
	{
		Principal principal = new Principal();
		return principal;
	}
	
	@Bean
	public Teacher mathTaeacherBean()
	{
		return new MathTeacher();
	}
	
	

}
