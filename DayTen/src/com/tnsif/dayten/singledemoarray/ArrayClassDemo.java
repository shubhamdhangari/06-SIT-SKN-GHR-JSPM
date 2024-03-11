package com.tnsif.dayten.singledemoarray;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

		//get the array
		int intArr[]= {69,20,12,40,35};
		
		//print the array
		System.out.println(Arrays.toString(intArr));
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binarysearch
		int key=20;
		System.out.println(Arrays.binarySearch(intArr, key));
		
		System.out.println(Arrays.binarySearch(intArr, 0, 3, 40));
		
		//comparison
		System.out.println(Arrays.toString(intArr));
		
		
		//get the second array
		int intArr1[]= {10,50,34,89};
		System.out.println(Arrays.toString(intArr1));
		
		//compare both the arrays
		if(Arrays.compare(intArr, intArr1)==1)
		{
			System.out.println("Both the arrays are same ");
		}
		else
		{
			System.out.println("Both arrays are not same ");
		}
		
		//copy array
		int intArr2[]=Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[]=Arrays.copyOfRange(intArr1, 1, 4);
		System.out.println(Arrays.toString(intArr3));
		
		//Fill method
		Arrays.fill(intArr3, 7);
		System.out.println(Arrays.toString(intArr3));
		
	}

}
