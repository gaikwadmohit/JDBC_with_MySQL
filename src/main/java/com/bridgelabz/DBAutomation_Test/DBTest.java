package com.bridgelabz.DBAutomation_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	
	public static Connection connection;
	
	public static void main(String[] args) throws SQLException {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/spotify","root","gaikwad595");
		
		Statement st=connection.createStatement();
		ResultSet rs = st.executeQuery("select * from users");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			System.out.println("data"+id+" "+name+" "+email);
			
		}
	
	
	}

}
