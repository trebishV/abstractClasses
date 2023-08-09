package com.trebish.AbstractClasses;

public class Manager extends Person {
	private double salary;
	public Manager(String name, double zp) {
		super(name);
		this.salary = zp;
	}

	@Override
	public String getDescriptionOfPerson() {
		
		return super.getName()+" have salary "+this.salary;
	}

}
