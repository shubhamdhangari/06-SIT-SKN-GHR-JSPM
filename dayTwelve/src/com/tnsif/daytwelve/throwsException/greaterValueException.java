package com.tnsif.daytwelve.throwsException;

public class greaterValueException extends Exception {

	public greaterValueException(String string)
	{
		super();
		
		
		
	}
	
	public greaterValueException()
	{
		super("Percentage should not be greater than 100");
	}
	
}
