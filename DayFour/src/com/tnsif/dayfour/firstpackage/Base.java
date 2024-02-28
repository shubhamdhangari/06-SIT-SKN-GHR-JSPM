package com.tnsif.dayfour.firstpackage;

public class Base {

	//Declaring default, public, private and protected variables
	
	int varDefault=10;
	public int varPublic= 20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//Declare methodds with default, private, public and protected 
	
	void methodDefault()
	{
		System.out.println("Default access Base Class");
		System.out.println("Default Varible : "+ varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access Base Class");
		System.out.println("Public  Varible : "+ varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private access Base Class");
		System.out.println("Private  Varible : "+ varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access Base Class");
		System.out.println("Protected  Varible : "+ varProtected);
	}
	
	
	
	
	
	
	
	
	
}
