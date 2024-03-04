package com.tnsif.daysix.staticdemo;

public class Employee {
//declare instances varibles 
	private String name;
	private int id;
	
	//declare static varibles
	
	static String companyName="TNS";

	public Employee(String name, int id) {
	
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", companyName=" + companyName + "]";
	}
	
	
	
	
	
	
}
