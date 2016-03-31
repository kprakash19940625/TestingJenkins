package com.netenrich;
import java.sql.*;
public class Register {
	private String first_name;
	private String last_name;
	private String email_id;
	private String password;
	public Register(String first,String last,String email,String pass){
		this.first_name = first;
		this.last_name = last;
		this.email_id = email;
		this.password = pass;
		
	}
	public void InsertDetails(){
		Main main = new Main();
		String database_url = main.Databaseurl();
		String database_username = main.Databaseusername();
		String database_password = main.Databasepassword();
		Databaseconnection db_connection = new Databaseconnection(database_username,database_password,database_url);
		java.sql.Connection connection = db_connection.Access_Database();
		try {
			String stmnt = "INSERT INTO register (first_name,last_name,email_id,password) VALUES (?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(stmnt);
			ps.setString(1, first_name);
			ps.setString(2, last_name);
			ps.setString(3, email_id);
			ps.setString(4, password);
			System.out.println(stmnt);
			int result = ps.executeUpdate();
			System.out.println(result);
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void InsertDetailss() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}
}
