package com.xworkz.Java_Basics.Basics.Operators;

class IncDecAssignment {
	
	public static void main(String args[]) 
	{

		int a = 12;   
		a--;                                    //12  (a=11)
		int b = 10 + (a++);                     //b=21  (a=12)
		                                   
		int c = 13 - ((a++) + (++b));           //c=-21 (a=13,b=22)    13-((12)+(22))
		                                    
		int d = c--;                            //d=-21 (c=-22)              
		b++;                                    //b=22  (b=23)
		int e = d + (--b);                      //e=1 (d=-21,b=22)     (-21 + (22))


		System.out.println(b+(a++));            //22+13=35  (a=14,b=22)
		System.out.println((c--) - d);          //-20+21=-1  (c=-19,d-=21)    
		System.out.println((++e) + (b));        //2+22=24  (e=2,b=22)
		System.out.println(c);                  //c=-23
		System.out.println(a++);                //14        (a=15)
		System.out.println(a);                  //15
		System.out.println(d);                  //-21
		System.out.println(e);                  //2
		System.out.println(b);                  //22

	}
}