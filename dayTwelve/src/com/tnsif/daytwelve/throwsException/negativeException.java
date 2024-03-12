package com.tnsif.daytwelve.throwsException;

public class negativeException extends Exception {
	public negativeException(String string)
	{
		super();
		
		
		
	}
	
	public negativeException()
	{
		super("Percentage should not be less than 0");
	}
	
}
