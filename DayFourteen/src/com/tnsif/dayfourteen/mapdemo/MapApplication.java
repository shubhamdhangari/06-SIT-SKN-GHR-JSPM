
/*
case 1:Add new element in Map

 * case 2:remove element from map
 * case 3:search element in map
 * case 4:view all elements in map */

package com.tnsif.dayfourteen.mapdemo;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class MapApplication 
{
	   public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			LinkedHashMap lp=new LinkedHashMap();
			do
			{
				System.out.println("1:Add new element");
				System.out.println("2:Remove Element");
				System.out.println("3:Search specific element");
				System.out.println("4:view All Data");
				System.out.println("Enter your choice");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					sc.nextLine();
					System.out.println("Enter the name of student");
					String name=sc.nextLine();
					System.out.println("Enter the id of student");
					int id=sc.nextInt();
					
					lp.put(id,name);
					System.out.println();
					break;
					
				case 2:
					System.out.println("Enter the id of student");
					id=sc.nextInt();
					
					boolean b=lp.containsKey(id);
					
					if(b)
					{
						Object val=lp.remove(id);
						System.out.println("Deleted elements  "+val);
					}
					else
					{
						System.out.println("Element not found");
					}
					System.out.println();
					break;
					
				case 3:
					System.out.println("Enter the id of student");
					id=sc.nextInt();  //1001
					Object val=lp.get(id);
					
					if(val!=null)
					{
						System.out.println("Element found  "+val);
					}
					else
					{
						System.out.println("Element not found");
					}
					System.out.println();
					break;
					
				case 4:
					Set keys=lp.keySet();
					Iterator i=keys.iterator();
					
					while(i.hasNext())
					{
						Object key=i.next();
						val=lp.get(key);
						System.out.println(key+"   "+val+"\n");
					}
					break;
				
				case 5:
					//System.out.println("Exit");
					
					System.exit(0);
					
					break;
					
					default:
						System.out.println("Wrong choice"+"\n");
						
				}
					
					
			}while(true);
		}

	}