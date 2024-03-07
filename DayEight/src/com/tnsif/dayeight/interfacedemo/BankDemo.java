package com.tnsif.dayeight.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {

		SavingAccount s1=new SavingAccount("Swapnil", "Pune", 1234, 17000);
		
		
		
		System.out.println(s1);
		s1.deposit(28000);
		System.out.println(s1);
		
		s1.withdraw(30000);
		System.out.println(s1);
		
		s1.withdraw(3000);
		System.out.println(s1);
	}

}
