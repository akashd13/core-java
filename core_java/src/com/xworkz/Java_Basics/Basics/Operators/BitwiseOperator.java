package com.xworkz.Java_Basics.Basics.Operators;

class BitwiseOperator {
	
	public static void main(String[] args) {

		int n1 = 22;
		int n2 = 13;
        
        //Bitwise AND operator
		System.out.println("n1&n2 = " + (n1 & n2));
        
        //Bitwise OR operator
		System.out.println("n1|n2 = " + (n1 | n2));
        
        //Bitwise XOR operator
		System.out.println("n1^n2 = " + (n1 ^ n2));
        
        //Bitwise Complement operator
		System.out.println("~n1 = " + (~n1));

	}
}