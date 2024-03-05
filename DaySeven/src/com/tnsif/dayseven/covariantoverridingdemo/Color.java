package com.tnsif.dayseven.covariantoverridingdemo;

//parent class
public class Color {

	
	protected Color getColor()
	{
		Color s=new Color();
		return s;
	}
}

//child class
class Red extends Color
{
	
	protected Red getColor()
	{
		Red s=new Red();
		return s;
	}
}


//child class
class Green extends Color
{
	
	protected Green getColor()
	{
		Green s=new Green();
		return s;
	}
}
