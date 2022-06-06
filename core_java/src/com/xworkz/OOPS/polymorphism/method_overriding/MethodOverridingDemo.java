package com.xworkz.OOPS.polymorphism.method_overriding;

public class MethodOverridingDemo {
	
	public static void main(String[] args) {
		
		RBI rbi = new RBI();
		SBI sbi = new SBI();
		Canara canara = new Canara();
		
		rbi.InterestRate();
		sbi.InterestRate();
		canara.InterestRate();
		
	}

}
