package com.bridgelabz.DBAutomation_Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DB_Test extends Base {
	@Test(priority = 1)
	
public void getTableData() throws SQLException {
	Statement st=connection.createStatement();
	ResultSet rs = st.executeQuery("select * from users");
	while(rs.next()) {
		int id=rs.getInt(1);
		String name=rs.getString(2);
		String email=rs.getString(3);
		System.out.println(id+" "+name+" "+email);
		
	} 
	
	}
	@Test(priority = 2)
	public void insertData() throws SQLException {
		PreparedStatement ps=connection.prepareStatement("insert into users values(?,?,?)");
		ps.setInt(1,4);
		ps.setString(2,"piyush");
		ps.setString(3,"piyu@gmail.com");

		ps.executeUpdate();
		getTableData();
	}
	
	@Test(priority = 3)
	public void updateData() throws SQLException {
		PreparedStatement ps1=connection.prepareStatement("update users set user_email=? where useer_id=?");
		
		ps1.setString(1,"tinu@gmail.com");
		ps1.setInt(2,1);
		
		ps1.executeUpdate();
		getTableData();
	}
	
	@Test(priority = 4)
	public void deleteData() throws SQLException {
		PreparedStatement ps2=connection.prepareStatement("DELETE FROM Users WHERE useer_id=?");
		
		
		ps2.setInt(1,3);
		
		
		ps2.executeUpdate();
		getTableData();
	}
	
	}

	
	
	
	

