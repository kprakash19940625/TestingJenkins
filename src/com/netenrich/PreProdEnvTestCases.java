package com.netenrich;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PreProdEnvTestCases {
	@Test
	public void Databasetest(){
		Main main = new Main();
		String database_url = main.Databaseurl();
		String database_username = main.Databaseusername();
		String database_password = main.Databasepassword();
		Databaseconnection db_connection = new Databaseconnection(database_username,database_password,database_url);
		java.sql.Connection connection = db_connection.Access_Database();
		assertNotNull(connection);
	}
}
