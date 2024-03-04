package com.tnsif.dayfive.associationdemohasA;

public class Executor {

	public static void main(String[] args) {


		Address address=new Address("Swargate COlony ", "Pune", 401, "Maharashtra", "411001");
		Person p=new Person("Shubham", address);
		
		
		p.displayinfo();


	}

}
