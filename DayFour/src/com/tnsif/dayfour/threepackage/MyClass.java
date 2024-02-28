package com.tnsif.dayfour.threepackage;
//Program to demonstrate singleton class
public class MyClass {
	
//	MyClass obj1=new MyClass(); //Early Instantiation
	
	
	private MyClass()
	{
		System.out.println("MyClass Object is created");
		
	}
	
	private static MyClass obj=null;
	
	
	public static  MyClass getObject()
	{
		if(obj==null)
		{
			obj=new MyClass();  // Lazy Instantiation
		}
		
		return obj;
	}
	

}
