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
	
	@Override
	public boolean equals(Object otherObj) {
		if (this == otherObj) return true;
		if (otherObj == null) return false;
		if(getClass() != otherObj.getClass()) return false;
		Person other = (Person)otherObj;
		return name.equals(other.getName());
		
	}
}
