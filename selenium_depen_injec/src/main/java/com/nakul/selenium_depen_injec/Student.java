package com.nakul.selenium_depen_injec;

public class Student {
	
	private int id;
	private String studentName;



	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public void displayName()
	{
		System.out.println("Student name and id is " + studentName +" " + id);
	}

}
