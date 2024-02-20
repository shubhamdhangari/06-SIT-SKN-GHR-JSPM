package com.tnsif.dayone;

public class PrimitiveDataTypeDemo {

	public static void main(String[] args) {
		
		
		//byte takes 1 byte
		byte byteMax = 127;
		byte byteMin= -128;
		
		System.out.println("Min range of byte is " + byteMin + " Max range of byte is "+ byteMax);
		
		//short take 2 bytes
		short shortMax = 32767;
		short shortMin = -32768;
		
		System.out.println("Min range of short is " + shortMin + " Max range of short is "+ shortMax);		
		
		
		//int = 4 bytes 
		
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Min range of int is " + minInt + " Max range of int is "+ maxInt);		
	
			long maxLong =9223372036854775807L;	
			long minLong =-9223372036854775808L;	
			System.out.println("Min range of long is " + minLong + " Max range of long is "+ maxLong);		

			float f= 3234.141243278345f;
			
			double d= 3456.14124512345678914f;
			System.out.println("float value is "+ f +"double value is "+ d);
			
			
			//boolean 
			boolean flag = false;
			System.out.println("boolean value is "+ flag);
			
			

	}

}
