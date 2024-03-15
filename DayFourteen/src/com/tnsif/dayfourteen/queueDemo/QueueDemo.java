package com.tnsif.dayfourteen.queueDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		
		Queue <Integer> r=new LinkedList<>();
		
		r.add(6);
		r.add(10);
		r.add(12);
		r.add(13);
		r.add(2);
		
		System.out.println(r);
		
		int positionpeek=r.peek();
		System.out.println("Using peek method first value from queue: "+positionpeek);
		
		int positionelements=r.element();
		System.out.println("Using elements method first value from queue: "+positionelements);

		System.out.println("--------------------------------------");
		System.out.println(r);
		
		int num1=r.remove();
		System.out.println(num1);
		System.out.println(r.remove());
		
		System.out.println(r);
		System.out.println(r.remove());

		
		System.out.println("--------------------------------------");

		System.out.println(r);
		System.out.println(r.remove());
		System.out.println(r);
		
		
		//System.out.println(r.size());
		
		Iterator itr=r.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(r.poll());
		
		
		System.out.println(r);
		
		System.out.println(r.retainAll(r));
	}

}
