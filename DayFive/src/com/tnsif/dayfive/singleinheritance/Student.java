package com.tnsif.dayfive.singleinheritance;


//child class
public class Student extends Citizen {
	
	//data member
	
	private int rollNo;
	private String collegeName;
	private String branch;

	//Default Constructor 
	public Student() {
		System.out.println("Student object created");
	}

	//Parameterized Constructor
	public Student(String name, int id, String address, int age, String birthPlace, int rollNo, String collegeName, String branch) {
		super( name,  id,  address,  age,  birthPlace);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
		this.branch = branch;
	}

	
	//Getter and setter 
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	//to String for return the output in string format 
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", branch=" + branch + ", getName()="
				+ getName() + ", getId()=" + getId() + ", getAddress()=" + getAddress() + ", getAge()=" + getAge()
				+ ", getBirthPlace()=" + getBirthPlace() + "]";
	}
	
	
	
	
	
	

}
