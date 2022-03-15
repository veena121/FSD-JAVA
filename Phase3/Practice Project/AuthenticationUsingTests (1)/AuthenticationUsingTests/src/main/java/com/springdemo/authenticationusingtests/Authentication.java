package com.springdemo.authenticationusingtests;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Authentication {

	public Boolean checkUser(String email, String password)
	{
		Connection con = DBconfig.getConnection();
		if(con!=null)
		{
			String query = "select * from users where email=? and password=?";
			PreparedStatement stat;
			try {
				stat = con.prepareStatement(query);
				stat.setString(1, email);
				stat.setString(2, password);
				ResultSet rs = stat.executeQuery();
				if(!rs.next())
				{
					return false;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return true;
	}
		
}
