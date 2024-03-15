package com.tnsif.dayfourteen.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(34);
		set.add(43);
		set.add(21);
		set.add(40);
		set.add(4);
		System.out.println(set);
		
		boolean b=set.contains(20);
		System.out.println(b);
		
		boolean b2=set.isEmpty();

		System.out.println(b2);
		
		set.remove(20);
		System.out.println(set);
		
		Iterator<Integer> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
