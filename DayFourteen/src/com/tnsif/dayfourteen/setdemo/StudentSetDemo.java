package com.tnsif.dayfourteen.setdemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {

		
		Set <Student> set=new HashSet<Student>();
		set.add(new Student (101, "Shubham", 78.65));
		set.add(new Student (101, "Shubham", 78.65));
		set.add(new Student (101, "Sonam", 58.65));
		set.add(new Student (102, "Sonam", 78.95));
		set.add(new Student (104, "Sayali", 99.65));
		
		System.out.println(set);

	
	
	
	
	}

}
