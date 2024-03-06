package com.tnsif.dayeight.abstractclassdemo;

public class AbstractDemo {

	public static void main(String[] args) {

		Square s=new Square();
		s.calArea();
		s.show();
		
		Rectangle r=new Rectangle();
		r.calArea();
		r.show();
		
		
		//dynamic binding 
		
		Shape s1;
		s1=new Square(3.0f);
		s1.calArea();
		s1.show();
		
		s1=new Rectangle(5, 7);
		s1.calArea();s1.show();
		
	}

}
