package com.nakul.bean_life_cycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	private String driver;
	private String url;
	private String userName;
	private String password;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void allRows() throws ClassNotFoundException, SQLException {
		Class.forName(driver); // load driver

		Connection con = DriverManager.getConnection(url, userName, password); // get a connection

		Statement stmt = con.createStatement(); // execute query

		ResultSet rs = stmt.executeQuery("select * from selenium_express.HostelStudentInfo");

		while (rs.next()) {
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			int hostelFees = rs.getInt(3);
			String foodType = rs.getString(4);

			System.out.println(studentId + " " + studentName + " " + hostelFees + " " + foodType);
		}
		con.close();

	}

	public void deleteRecord(int studentId) throws ClassNotFoundException, SQLException {
		Class.forName(driver); // load driver

		Connection con = DriverManager.getConnection(url, userName, password); // get a connection

		Statement stmt = con.createStatement(); // execute query

		stmt.executeUpdate("delete from selenium_express.HostelStudentInfo where Student_id = " + studentId);

		con.close();
	}

}
