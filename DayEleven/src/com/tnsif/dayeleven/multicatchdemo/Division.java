package com.tnsif.dayeleven.multicatchdemo;

import java.util.Scanner;

public class Division {

	public static void divide()
	{
		int a,b,c;
		
		int [] arr= {13,78,15,34,50};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		try {
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a/b;
	
		System.out.println("C = "+c);
		
		//System.exit(0);
		
	 //  System.out.println(arr[33]);	
		System.out.println(arr[c]);
		
		
		}
		
		catch(ArithmeticException ae)
		{
			 System.err.println("I am in catch block " + ae.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException ae)
		{
			 System.err.println("I am in catch block " + ae.getMessage());

		}
		catch(Exception e)
		{
			 System.err.println("I am in catch block " + e.getMessage());

		}
		finally
		{
			System.out.println("Bye");
			sc.close();
		}
		System.out.println("Bye");
		
	}
}
