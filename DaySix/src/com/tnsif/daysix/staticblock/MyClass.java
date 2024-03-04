package com.tnsif.daysix.staticblock;

public class MyClass {

	
	private int section ; //non static
	private static int srNo;  // static
	
	
	
	//section =200;
	//static block 
	static 
	{
	System.out.println("in static block ");	
		
	//section =200;	cannot use non static into static block 
	srNo=100;
		
	}
	
	
	//default constructor
	public MyClass()
	{
		System.out.println("Default Constructor ");
		srNo++;
		section++;
	}


	@Override
	public String toString() {
		return "MyClass [section=" + section + ", srNo=" + srNo + "]";
	}
	
	//static method
	static void display()
	{
	
		System.out.println(srNo);
		//System.out.println(section);
	}
	

	//non static method 
	public void print()
	{
	
		System.out.println(srNo);
		System.out.println(section);
	}
	
	
	
	
}
