package com.tnsif.daytwo.jumpstmt;

public class ContinueDemo {

	public static void main(String[] args) {
		
		for (int k=5; k<15; k++)
		{
			//odd number are skipped

		if(k%2 !=0)
			continue;
		//Even numbers are printed
		System.out.println(k +" ");
			
		}
		
	
	}

}
