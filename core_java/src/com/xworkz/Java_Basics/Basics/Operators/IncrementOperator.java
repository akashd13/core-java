package com.xworkz.Java_Basics.Basics.Operators;

class IncrementOperator{
	public static void main(String[] args) {
     
     //Pre Increment (Prefix with operand)

		int a = 10;
		int b = ++a;

		System.out.println("a :" + a);
		System.out.println("b :" + b);

        System.out.println("a :" + (++a));  
        //Increment operator also works in SOP
        //Cannot call void inside SOP because of return type
		System.out.println("b :" + b);	


	 //Post Increment (Suffix with operand)
	 
	   int q = 20;
	   int w = q++;

       System.out.println("a :" + q); //21
	   System.out.println("b :" + w); //20


	}
}