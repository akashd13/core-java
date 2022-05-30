package com.xworkz.core_java.Inheritance.Hierarchical_inheritance;

public class Kitkat extends Chocolate {
	
	String shape = "Bar";
	
	void Madeof() {
		
		System.out.println("Kitkat is made up of " + name + " and milk");
	}
	
	void Texture() {
		
		System.out.println("Texture of Kitkat chocolate is in " + shape + " shape");
	}

}
