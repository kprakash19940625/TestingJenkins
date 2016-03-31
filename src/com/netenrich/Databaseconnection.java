package com.netenrich;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconnection {
	private String username;
	private String password;
	private String database_url;
	java.sql.Connection connection=null;
	
	public Databaseconnection(String user_name,String Password,String databaseurl){
		username=user_name;
		password=Password;
		database_url = databaseurl;
	}
	public Connection Access_Database(){
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(database_url,username,password);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
		} 
		return connection;
	}
}
