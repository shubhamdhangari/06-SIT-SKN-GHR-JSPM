package com.tnsif.dayseven.complitetimedemo;

public class OverLoadingDemo {

	public static void main(String[] args) {

		
		Point p1=new Point();
		System.out.println(p1);
		
		Point p2=new Point(2.0f);
		System.out.println(p2);
		
		Point p3=new Point(4, 6);
		System.out.println(p3);
		
		
		//method overloading
		MethodOverloading m=new MethodOverloading();
	
		
		System.out.println(m.addition(12, 14));
		m.addition(12.7f, 97.87f);
		System.out.println(m.addition(2, 3, 4));
		
		
	}

}
