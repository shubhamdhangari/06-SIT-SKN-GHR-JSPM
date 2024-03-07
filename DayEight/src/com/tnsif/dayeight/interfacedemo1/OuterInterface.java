package com.tnsif.dayeight.interfacedemo1;

public interface OuterInterface {

	void calArea();
	
	interface InnerInterface
	{
		int id=20;
		void print();
	}
}
