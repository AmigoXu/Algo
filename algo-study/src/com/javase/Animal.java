package com.javase;

public abstract class Animal {
	
	public String name = "animal";
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	abstract void eat();
}
