package com.xworkz.core_java.has_a_relation;

public class HasARealatinDemo {
	
	public static void main(String[] args) {
		
	
	
	Human human = new Human();
	human.heart = new Heart();
	
	
	human.name = "Akash";
	human.age = 24;
	human.heart.Heart_health = "Healthy";
	human.heart.NoofBeats = "60 to 100";
	
	System.out.println("Human name is :" + human.name);
	System.out.println("Age of " +human.name + " is : " + human.age);
	System.out.println("Heart health of " + human.name + " is : " + human.heart.Heart_health);
	System.out.println("No of Heart beats : " + human.heart.NoofBeats);
	
	
	}
}
