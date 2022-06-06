package com.xworkz.Java_Basics.Basics.Operators;

class UnaryProblem{
	
	public static void main(String args[]) {

	int a = 10;
	int b = 20;
	int c = 30;

      c = a;
      --a; //9


    System.out.println(c++); // 10       c=11
    System.out.println(a++); //9         a=10
    System.out.println(b--); //20        b=19
    System.out.println((--b)+(--c));  //28   //b=18,c=10
    System.out.println(a);    //10
    System.out.println(b);    //18
    System.out.println(c);    //10

   }
}