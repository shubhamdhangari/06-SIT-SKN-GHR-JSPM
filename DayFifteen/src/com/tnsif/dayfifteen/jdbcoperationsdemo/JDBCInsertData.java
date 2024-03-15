package com.tnsif.dayfifteen.jdbcoperationsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsertData {

	public static void main(String[] args) {


		try {
			//step1: load or register the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver is load succesfully");
			
			
			//Step2: Create connection bet java and sql
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sitsknjspmghr","root","root");
			System.out.println("Connection created succesfully");
			
			//step3: create Statement object
			
			Statement stmt=con.createStatement();
			System.out.println("Statement created successfully");
			
			//step4: write a query
			String q="insert into student values(105, 'Aditya', 'HTML', 50)";
			
			boolean s=stmt.execute(q);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
