package com.app;

public class Mango extends Fruits{

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
	}

	@Override
	public String taste() {
		return "sweet";
	}
	public void jam() {
		System.out.println("The colour of "+getName()+" is "+getColor()+" and the pulp is been createed");
	}
	

}
