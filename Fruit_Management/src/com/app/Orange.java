package com.app;

public class Orange extends Fruits {

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
		
	}

	@Override
	public String taste() {		
		return "sour";
	}
	
	public void juice() {
		System.out.println("The weight of "+getName()+" is "+getWeight()+" Extracting juice");
	
	}

}
