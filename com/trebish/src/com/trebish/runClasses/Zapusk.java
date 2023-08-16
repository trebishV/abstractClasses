
package com.trebish.runClasses;

import java.util.ArrayList;

import com.trebish.AbstractClasses.*;

public class Zapusk {
	
	//cheli.add(new Employe("Gusdabzhak", 3));
	
	public static void main(String[] args) {
		ArrayList<Person> cheli = new ArrayList<Person>();
		
		
		Object p1 = new Employe("Gubuzduk", 3);
		Person p2 = new Manager("Uzukrab",3440.20);
		Manager p3 = new Manager("Gubuzduk",7);
		cheli.add(p3);
		cheli.add(p2);
		cheli.add((Person)p1);
		
		
		
		if (p1.equals(p3)) System.out.print("cheli равны");
		
		
		for (Person p: cheli) System.out.println(p.getDescriptionOfPerson());

	}

}
