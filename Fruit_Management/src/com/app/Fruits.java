package com.app;

public abstract class Fruits {
	
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	public Fruits(String color,double weight,String name) {
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.fresh=true;
	}

	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public abstract String taste();
		
	
}
