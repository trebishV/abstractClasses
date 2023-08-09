
package com.trebish.runClasses;

import java.util.ArrayList;

import com.trebish.AbstractClasses.*;

public class Zapusk {
	
	//cheli.add(new Employe("Gusdabzhak", 3));
	
	public static void main(String[] args) {
		ArrayList<Person> cheli = new ArrayList<Person>();
		
		
		Person p1 = new Employe("Gubuzduk", 3);
		Person p2 = new Manager("Uzukrab",3440.20);
		cheli.add(p2);
		cheli.add(p1);
		for (Person p: cheli) System.out.println(p.getDescriptionOfPerson());

	}

}
