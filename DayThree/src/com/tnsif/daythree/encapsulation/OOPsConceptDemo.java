package com.tnsif.daythree.encapsulation;


public class OOPsConceptDemo {

	private  int serialNum;
	private  String name;
	 private int age;
	 
	 //Getter and setter 
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//object class method - to return string representation of the object
	@Override
	public String toString() {
		return "OOPsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	 
	
	
	
	 
	 
	 
	
	
	
}
