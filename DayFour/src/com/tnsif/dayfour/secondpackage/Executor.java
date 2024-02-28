package com.tnsif.dayfour.secondpackage;

import com.tnsif.dayfour.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		
		Base b1=new Base();
		//b1.methodDefault();
		//b1.methodProtected();
		b1.methodPublic();
	//	b1.methodPrivate();
		
		b1.methodPublic();
		b1.varPublic=23;
		b1.methodPublic();
		

	}

}
