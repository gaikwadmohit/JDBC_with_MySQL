package com.bridgelabz.DBAutomation_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.BeforeTest;


public class Base {
	public static Connection connection;
	
	@BeforeTest
	public Connection getConnection() throws SQLException {
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/spotify",
			"root","gaikwad595");
	return connection;
	
}
	
	
}
