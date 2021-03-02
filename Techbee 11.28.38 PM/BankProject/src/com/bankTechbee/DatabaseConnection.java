package com.bankTechbee;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DatabaseConnection {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		    final String DB_URL = "jdbc:mysql://database-1.cogxycywcnkt.us-east-2.rds.amazonaws.com\n:3306/";
		    final String USER = "admin";
		    final String PASS = "12345678";
		    
		    Connection conn = null;
		    
		    try {
		    	Class.forName("com.mysql.jdbc.Driver");
		    	System.out.println("Connecting to database...");
		     
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				
			      System.out.println("Creating table in given database...");
			      Statement stmt = conn.createStatement();
			     
	
			      String sql = "CREATE TABLE OurTable " + 
			                   "(AccountId INTEGER not NULL, " +
			                   " firstName VARCHAR(255), " + 
			                   " lastName VARCHAR(255), " + 
			                   " balance INTEGER(10000));"; 
	 		      

			      stmt.executeUpdate(sql);
			      System.out.println("Created table in given database...");
				
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

	}

