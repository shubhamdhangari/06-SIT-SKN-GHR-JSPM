package com.tnsif.runnabledemo;

public class RunnableDemo {

	public static void main(String[] args) {

//		UsingRunnable r=new UsingRunnable( 10,1,"Hiii");
		
//		Runnable r1=new Runnable()
//				{
//
//					@Override
//					public void run() {
//
//						System.out.println("Runnable wuth anonymous class");
//					}
//			
//				};
//				
//				Thread t1=new Thread(r1);
//				t1.start();
		
		Runnable r2=()->System.out.println("runnable with lambda expression ");
		new Thread(r2).start();
		
	}

}
