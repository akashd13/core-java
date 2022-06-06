package com.xworkz.OOPS.contructors.contructor_overloading;

public class ConstructorOverloadingDemo {
	
	public static void main(String[] args) {
		
	
	
	TriumphTiger triumphtiger = new TriumphTiger("1200" , "12 lakhs" , "Pacific blue");
	
	TriumphTiger triumphtiger1 = new TriumphTiger("1500" ,15 , "Dark black");
	
	
	
	
	System.out.println("        Bike deatails :  " );
	System.out.println("   Bike capacity : " + triumphtiger.CC);
	System.out.println("   Cost of bike : " + triumphtiger.price);
	System.out.println("   Color of bike : " + triumphtiger.color);
	
	System.out.println("        Bike details for bike 2 :");
	System.out.println("   Bike capacity : " + triumphtiger1.CC);
	System.out.println("   Cost of bike : " + triumphtiger1.price);
	System.out.println("   Color of bike : " + triumphtiger1.color);


	}

}
