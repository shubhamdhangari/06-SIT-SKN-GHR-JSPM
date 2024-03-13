package com.tnsif.multithreadingDemo;

public class ChildDemo {

	public static void main(String[] args) {
		System.out.println("End of the program");

		ChildThread t1=new ChildThread(5, "hello");
		ChildThread t2=new ChildThread(10, "hii.....!!!!!!!!");
	//t1.run();
		System.out.println("End of the program");

		t1.start();
		
		System.out.println("End of the program");

		t2.start();
		System.out.println("End of the program");
		//3 hii    4 hello 1 hii       1 hello       remaing hii
		System.out.println("End of the program");

	}

}
