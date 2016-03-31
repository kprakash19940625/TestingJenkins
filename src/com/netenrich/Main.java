package com.netenrich;
import java.util.*;
import java.sql.*;
public class Main {
	private String database_url = "jdbc:mysql://databaseinstance.csganqaov5mj.us-east-1.rds.amazonaws.com:3306/register";
	private String database_username = "roo";
	private String database_password = "zxcv12345";
	public static void main(String args[]) throws SQLException{
		Scanner input = new Scanner(System.in);
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("Enter A Number Corresponding To Your Option:");
		int choice = input.nextInt();
		if (choice == 1){
			System.out.println("Enter First Name:");
			String first_name = input.next();
			System.out.println("Enter Last Name:");
			String last_name = input.next();
			System.out.println("Enter Email ID:");
			String email_id = input.next();
			System.out.println("Enter Password:");
			String password = input.next();
			Register register = new Register(first_name,last_name,email_id,password);
			register.InsertDetails();
	}
		else if (choice==2){
			System.out.println("Enter UserName:\t");
			String user_name = input.next();
			System.out.println("Enter Password:\t");
			String password = input.next();
			Login login = new Login(user_name,password);
		}
		else{
			System.out.println("No Choice found.");
		}
	}
	public String Databaseurl(){
		return database_url;
		
	}
	public String Databaseusername(){
		return database_username;
	}
	public String Databasepassword(){
		return database_password;
	}
}
