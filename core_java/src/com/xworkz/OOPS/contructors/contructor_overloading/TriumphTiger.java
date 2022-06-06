package com.xworkz.OOPS.contructors.contructor_overloading;

public class TriumphTiger {
	
	String CC;
	String price;
	String color;
	
	TriumphTiger(String capacity, String cost, String clr) {
	CC = capacity;
	price = cost;
	color = clr;
	
	}
	
	TriumphTiger(String capacity,int cost, String clr) {
		
		CC = capacity;
		color = clr;
	}
	
	
	

}
