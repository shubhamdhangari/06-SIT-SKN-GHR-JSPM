package com.tnsif.dayfourteen.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		
		List list1=new ArrayList(); // dynamic binding
		list1.add(10);
		list1.add(20);
		list1.add("Megana");
		list1.add("tushar");
		list1.add(false);
		list1.add(true);
		list1.add(20);
		list1.add(10);
		list1.add(12.4f);
		System.out.println("list is  "+list1);
		System.out.println(list1.isEmpty());
		
		System.out.println(list1.size());
		
		System.out.println("is list contains 10?" + list1.contains(10));
		
		list1.remove(false);
		System.out.println("List is "+ list1);
		
//		list1.remove(20);
//		System.out.println("List is "+ list1);
		
		System.out.println(list1.get(5));
		
		
		System.out.println(list1.remove(list1.lastIndexOf(20)));
		System.out.println("List is "+ list1);

		
		System.out.println(list1.indexOf(20));
		System.out.println("List is "+ list1);
		
		System.out.println(list1.remove(list1.indexOf(20)));
		System.out.println("List is "+ list1);


//		Collections.sort(list1);
//		System.out.println("List is "+ list1); RTE CCE

		list1.clear();
		System.out.println("List is "+ list1);

		
		System.out.println("------------------------------------------------------------------------");
		//Generics
		
		List<String> names=new ArrayList<>();
		names.add("Dilip");
		names.add("Dhiraj");
		names.add("jaya");
		names.add("Swapnil");
		names.add("Rameshwari");
//		names.add(null);
//		names.add(null);
		//names.add(10); CTE

		names.add("Aditya");
		names.add("Govind");
		System.out.println("List of names  "+ names);
		
		Collections.reverse(names);
		System.out.println("List of names  "+ names);


		System.out.println(names.contains("jaya"));
		
		Collections.sort(names);
		System.out.println("List of names  "+ names);
		
		Collections.reverse(names);
		System.out.println("List of names  "+ names);

		
		//Traversing a list
		
		Iterator<String> i=names.iterator();
		

		while(i.hasNext())
		{
			String nm=i.next();
			System.out.println(nm);
			if(nm.equals("jaya"))
				i.remove();
		}
		System.out.println(names);
		
		
		ListIterator<String> li=names.listIterator(names.size());
		while(li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
		}
	}

}
