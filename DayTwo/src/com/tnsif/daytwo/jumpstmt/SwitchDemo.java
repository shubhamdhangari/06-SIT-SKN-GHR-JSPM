package com.tnsif.daytwo.jumpstmt;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char x='d';
		
		
		
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x+" for lion");
			break;
			
		case 'd':
		case 'D':
			System.out.println(x +" for Dog");
			break;
		case 'w':
		case 'W':
			System.out.println(x +"for wood");
			break;	
		case 's':
		case 'S':
			System.out.println(x +" for ship");
			break;	
			
			
			default:
				System.out.println(x+"is other letter plz insert in the given options");
			
		}

	}

}
