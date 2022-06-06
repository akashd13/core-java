package com.xworkz.OOPS.polymorphism.method_overloading;

public class MethodOverloadingDemo {
	
	public static void main(String[] args) {
		
		Multiplication multiplication = new Multiplication();
		
		 multiplication.multiply(11, 22);
		 multiplication.multiply(10.2f, 22.4f);
		 multiplication.multiply(12, 23, 30);
		 multiplication.multiply(11.3f, 32.1f, 33.3f);
	}

}
