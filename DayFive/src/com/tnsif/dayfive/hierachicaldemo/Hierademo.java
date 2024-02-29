package com.tnsif.dayfive.hierachicaldemo;

public class Hierademo {

	public static void main(String[] args) {
		
		
		Person p=new Person();  // tight coupling 
		System.out.println("Person class details...............");
		System.out.println(p);
		
		
		//dynamic binding  //runtime polymorphism // loose coupling 
		Person p1;  //object reference 
		p1=new Person("Swapnil", "Mumbai", 23);
		if (p1 instanceof Person)

		System.out.println(p1);
		
		p1=new Employee("Rohit", "Pune", 24, 21102, "TNS", "JD", 50000);
		if (p1 instanceof Person)

		System.out.println(p1);
		
		p1=new Student("Anushka", "Delhi", 24, 101, "Comp", "SKN");
		if (p1 instanceof Person )  

		System.out.println(p1);
		
		

	}

}
