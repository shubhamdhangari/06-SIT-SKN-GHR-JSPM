package com.tnsif.dayfive.associationdemo;


//Parent Class
public class Employee {

	private String name;
	private int empid;
	private String department;
	private int mobile;
	
	//default constructor
		public Employee() {
			super();
		}
		//para constructor
		public Employee(String name, int empid, String department, int mobile) {
			super();
			this.name = name;
			this.empid = empid;
			this.department = department;
			this.mobile = mobile;
		}
		//getter and setter 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public int getMobile() {
			return mobile;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", empid=" + empid + ", department=" + department + ", mobile=" + mobile
					+ "]";
		}
		
		
		
	
	
	
	
}
