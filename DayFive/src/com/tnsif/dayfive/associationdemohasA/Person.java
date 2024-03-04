package com.tnsif.dayfive.associationdemohasA;


//HAS A
//Person ----------------------Address
//                 plotno state streetno lane no, nearby location, pincode 



//Container class

public class Person {

	private String name;  //shubham dhangar 
	private Address address;  // flat no state county pc nl
	
	
	
	
	public Person(String name, Address address) {
	
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void displayinfo()
	{
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address.getStreet() + ", " + address.getFlatno()+ ", " 
		+address.getCity()+ ", " +address.getPostalCode()+ ", " +address.getState());

	}
	
}
