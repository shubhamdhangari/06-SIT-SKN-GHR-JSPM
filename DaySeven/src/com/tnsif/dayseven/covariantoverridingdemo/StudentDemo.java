package com.tnsif.dayseven.covariantoverridingdemo;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1=new Student(101, "Aakash", "CSE");
		s1.print();
		
		Student s2=(Student)s1.clone();
		s2.setRollNo(102);
		s2.setName("Dhiraj");
		s2.setBranch("IT");
		s2.print();
		
		Student s3=s1.clone();
		s3.setRollNo(102);
		s3.setName("Aditya");
		s3.setBranch("II");
		s3.print();
		
	
	}

}
