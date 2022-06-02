package com.xworkz.core_java.MethodOverriding;

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		RBI rbi = new RBI();
		SBI sbi = new SBI();
		Canara canara = new Canara();
		
		rbi.InterestRate();
		sbi.InterestRate();
		canara.InterestRate();
		
	}

}
