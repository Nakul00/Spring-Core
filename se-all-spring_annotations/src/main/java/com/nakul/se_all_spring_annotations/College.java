package com.nakul.se_all_spring_annotations;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;

//@Component("collegeBean") //default bean id same as class name eg. college
public class College {
	
	private Principal principal;
	
	private Teacher teacher;
	
	@Value("GMU")
	private String collegeName;
	
	
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public College(Principal principal) {
		this.principal = principal;
	}


	public void test()
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("testing!");
		System.out.println("My college name is " + collegeName);
	
	}

}
