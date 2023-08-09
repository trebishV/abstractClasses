package com.trebish.AbstractClasses;

public class Employe extends Person{
	private int grade;
	public Employe(String name, int grade) {
		super(name);
		this.grade= grade;
	}

	@Override
	public String getDescriptionOfPerson() {
		
		return super.getName() +"dont have some salary, he have only grade that is "+this.grade;
	}

}
