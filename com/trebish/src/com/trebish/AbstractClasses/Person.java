package com.trebish.AbstractClasses;

public abstract class Person {
	private final String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public abstract String getDescriptionOfPerson();
}
