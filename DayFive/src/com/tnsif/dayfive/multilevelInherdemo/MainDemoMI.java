package com.tnsif.dayfive.multilevelInherdemo;

public class MainDemoMI {

	public static void main(String[] args) {
		
		City c=new City();
		
		c.setArea(100.89f);
		c.setPopulation(200000);
		c.setCityName("Mumbai");
		c.setStateName("Maharashtra");
		c.setLanguage("Marathi");
		c.setCapital("Delhi");
		c.setCountryName("India");
		c.setCode(91);
		
		System.out.println(c);

	}

}
