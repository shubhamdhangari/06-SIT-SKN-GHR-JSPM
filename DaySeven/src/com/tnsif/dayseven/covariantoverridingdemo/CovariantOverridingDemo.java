package com.tnsif.dayseven.covariantoverridingdemo;

public class CovariantOverridingDemo {

	public static void main(String[] args) {
		
		Color c=new Color();
	    System.out.println(c.getColor());
	    
	    Red r =new Red();
	    System.out.println( r.getColor());
	    
	    Green r1 =new Green();
	    System.out.println( r1.getColor());

	}

}
