package com.tnsif.daytwo;

public class OperatorDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int x = 10;
		System.out.println("a and b value before the operations: " + a + " " + b);
		
		// increament ++     varible++ =====>> post increament         ++varible =====> pre increament 
		//decreament  --     varible-- =====>> post decreament         --varible =====> pre decreament 
		
		++a;
		
		
	//          12      11      11          10   9      9      10     
		int c= (++a)  + (--a)  + a--   -   a +  --a  +  a++  ;
		
		System.out.println("c value after the operations: " + c);
		
		
	//	       52    10  20
		int d= c++ + a + b--;
		System.out.println("d value after the operations: " + d);

		//Tewrnary opeeratoe demonstration
		x = (10 ==x) ? 1: 0 ;
		System.out.println(x);
		
		
		
	}

}
