package com.tnsif.dayfourteen.queueDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeDemo {

	public static void main(String[] args) {
		Deque<String> deque1= new ArrayDeque<String>();
		deque1.add("Gautam");
		deque1.add("Kiran");
		deque1.add("Shreya");
		System.out.println("Queue is: "+ deque1);
		//Traversing elements
		
		deque1.pollLast();
		System.out.println("Queue is: "+ deque1);

		deque1.addFirst("Aakash");
		System.out.println("Queue is: "+ deque1);
		
		for(String str:deque1)
		{
			System.out.println("Queue is: "+ str);

		}
		
		System.out.println("Queue is: "+ deque1);


		
	}

}
