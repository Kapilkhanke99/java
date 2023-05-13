package com.app;

public class Apple extends Fruits {

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
	}
	@Override
	public String taste() {
		return "Sweet and Sour";
	}
	public void pulp() {
		System.out.println("The colour of "+getName()+" is "+getColor()+" making jam!");
		}	
}
