package com.tnsif.daynine.multidimensionalddemo;


class JaggedArray {
	static void printArray(int d[][])
	{
		for (int i=0; i<d.length; i++)
		{
			for (int j=0; j<d[i].length; j++)
				System.out.print(d[i][j] + " ");
			System.out.println();
		}
	}
}


public class JaggedArrayDemo {

	public static void main(String[] args) {
	
		int d[][]= { {10,20,30} , {40}, {12,24,36,48}, {11,110} };
		
//		int data[][]=new int [4][];
//		
//		//row0
//		data[0][0]=10;
//		data[0][1]=20;
//		data[0][2]=30;
//		
//		
//		//row1
//		data[1][0]=18;
//		
//		
//		
//		//row0
//		data[2][0]=101;
//		data[2][1]=201;
//		data[2][2]=301;
//		data[2][3]=45;
//		data[2][4]=87;
//
//		data[3][0]=45;
//		data[3][1]=87;
//		
		System.out.println("Total Rows in Array " + d.length);
		
		JaggedArray.printArray(d);
		
	}

}
