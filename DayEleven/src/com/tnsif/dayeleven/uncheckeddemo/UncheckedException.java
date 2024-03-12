package com.tnsif.dayeleven.uncheckeddemo;

public class UncheckedException {

	public static void main(String[] args) {

		//declare array
		int x[];
		
	//	System.out.println(x[0]);  CTE
		try {
		x=new int[] {1,2,3,4,5};
		System.out.println(x[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Specified index does not exist "+ e.getMessage());
		}
		System.out.println("end of the program");
				
		
		
	}

}
