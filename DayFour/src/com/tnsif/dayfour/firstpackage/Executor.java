package com.tnsif.dayfour.firstpackage;

public class Executor {

	public static void main(String[] args) {
	
		
		//accessing same package class

		
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
	//	b1.methodPrivate();  //CTE
		
	
		b1.varDefault=11;
		b1.methodDefault();
		
		//private member accessing
		//b1.varPrivate();  //CTE
//		b1.methodPrivate();  //CTE
		
		b1.varProtected=31;
		b1.methodProtected();
		
		b1.varPublic=41;
		b1.methodPublic();
		
		//instance of operator 
		
		System.out.println(b1 instanceof Base);  //returns TRUE or False  //CTE
		
//		Person p=new Person();
//		System.out.println(p instanceof Person );
		
		//Incompatible types
		
		
		
	}

}
