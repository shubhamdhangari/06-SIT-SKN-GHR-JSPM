package com.tnsif.dayseven.runtimedemo;

public class OverRidingDemo {

	public static void main(String[] args) {

		//dynamic binding/ late binding/lazy instiatition / runtime pol/loose coupling 
		RBI rbi;

		
		rbi=new RBI();
		System.out.println(rbi instanceof RBI);
		
		
		System.out.println(rbi.getRateofInterest());
		
		rbi=new Axis();
		System.out.println(rbi.getRateofInterest());
		System.out.println(rbi instanceof ICICI);
		
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());


	}

}
