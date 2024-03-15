package com.tnsif.dayfourteen.mapdemo;

import java.util.Hashtable;

public class HashMapTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(101, "Mumbai");
		ht.put(102, "New Mumbai");
		ht.put(103, "Pune");
		ht.put(101, "Aurangbad");
		
		System.out.println(ht);
		
		ht.putIfAbsent(104, "PCMC");
		ht.put(105, "Baramati");
		//ht.put(110, null);
		
		ht.put(101, "abc");
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		
		System.out.println(ht.replace(102, "Bombay"));
		System.out.println(ht);
		
		
	}

}
