
package com.xworkz.Java_Basics.Basics.Operators;
class OperatorsAssignment {
	
	public static void main(String args[]) {

        System.out.print( ((true && true) || false));


      int a=3, b=8;
      boolean c = a>5 && ++b>6;
      System.out.println(b);  //8

      int d=5, e=9;
      boolean f = d>1 || e++<10;
      System.out.println(e);   //9

      int i=4, j=6, k=8;
      boolean p = i>5 && j>5 && k++<10;
      System.out.println(k);  //8


      int l=4, m=6, n=8;
      boolean o = l<5 || m>5 && ++n<10;
      System.out.println(n);  //8


    
	}
}