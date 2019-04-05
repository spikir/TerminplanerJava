package model;

import java.sql.*;

public class MySqlCon {
	protected Statement stmt;
	
	public void open_connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/termine", "root", "");
			stmt = con.createStatement();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
