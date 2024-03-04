package com.tnsif.daysix.finalvaribledemo;

public class FinalVarible {

	//declare varible 
	
	//final int x;  final varible must be initialized
	
	final int x=34;
	
	//declare static and final varible
	final static int y;
	
	//declare static and final varible
		final static int z=100;
	
	
	//instance method
		public void change()
		{
			//x=30;
			//y=20;
			//z=23;
		}
		
		static
		{
			//x=35;  //non static not allowed
			y=50;
			//y=51;
			//z=43;
			
		}
	
	
	
}
