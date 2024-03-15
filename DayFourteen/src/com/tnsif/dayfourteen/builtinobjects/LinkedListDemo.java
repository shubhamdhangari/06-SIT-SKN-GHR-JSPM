package com.tnsif.dayfourteen.builtinobjects;

/*
 * LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
 *  It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList,
 *   the manipulation is fast because no shifting is required
 */

import java.util.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		
		System.out.println(ll);
		
		
		ll.addFirst(5);
		ll.add(2, 60);
		ll.addLast(03);
		
		System.out.println("Number list is " +ll);
		
		System.out.println("First Elements is " +ll.getFirst());
		System.out.println("First Elements is " +ll.getLast());
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		
		ListIterator<Integer> li = ll.listIterator();
		while (li.hasNext())
			System.out.print(li.next() + "\t");
		
		System.out.println();
		
		li=ll.listIterator(ll.size());
		while(li.hasPrevious())
		{
			int n=li.previous();
			System.out.print(n + "\t");
			System.out.println();
			if (n == 20)
				li.add(999999);
			if (n == 60)
				li.set(5555);
		}
		System.out.println("Number List is " + ll);


		Collections.sort(ll);
		System.out.println(ll);
		
		Collections.reverse(ll);
		System.out.println(ll);
	}

}
