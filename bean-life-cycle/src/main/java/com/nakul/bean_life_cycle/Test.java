package com.nakul.bean_life_cycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO studentdao = context.getBean("studentDAO", StudentDAO.class);
		studentdao.allRows();
		
		

	}

}
