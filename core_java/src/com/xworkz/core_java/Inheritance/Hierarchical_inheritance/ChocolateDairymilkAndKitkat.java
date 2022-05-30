package com.xworkz.core_java.Inheritance.Hierarchical_inheritance;

public class ChocolateDairymilkAndKitkat {
	
	public static void main(String[] args) {
		
		Kitkat kitkat = new Kitkat();
		CadburyDairymilk cadburydairymilk = new CadburyDairymilk();
		Chocolate chocolate = new Chocolate();
		
		kitkat.Choco();
		cadburydairymilk.Texture();
		kitkat.Madeof();
		kitkat.Texture();
		cadburydairymilk.Ingredients();
		cadburydairymilk.Taste();
		
		
	}

}
