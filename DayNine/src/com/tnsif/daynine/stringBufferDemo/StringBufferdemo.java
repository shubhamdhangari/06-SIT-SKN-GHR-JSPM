package com.tnsif.daynine.stringBufferDemo;

public class StringBufferdemo {

	public static void main(String[] args) {

		//String Buffer length vs capacity
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		//appending and inserting into SB
		String s;
		int a=42;
		buffer=new StringBuffer(40);
		s= buffer.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer=new StringBuffer("I Java!");
		buffer.insert(2, "like " );
		System.out.println(buffer);
		
//		buffer.delete(7, 10);
//		System.out.println(buffer);

		System.out.println(buffer.reverse());
	}

}
