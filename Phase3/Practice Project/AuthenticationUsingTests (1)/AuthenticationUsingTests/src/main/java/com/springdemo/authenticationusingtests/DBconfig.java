package com.springdemo.authenticationusingtests;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconfig {

	public static Connection getConnection()
	{
		Connection con = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "root";
		String password = "root";
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
