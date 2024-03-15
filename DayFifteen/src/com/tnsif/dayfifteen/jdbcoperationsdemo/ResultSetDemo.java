package com.tnsif.dayfifteen.jdbcoperationsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {

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
			
			
			
			
			ResultSet rs=stmt.executeQuery("select * from student where stdid=104");
			System.out.println("Stdid\tname\tsubject\tduration");
			
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4 ));
			
			
			
			//step4: write a query
		//	String q="alter table student add primary key(stdid)";
			
			//int s=stmt.executeUpdate(q);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
