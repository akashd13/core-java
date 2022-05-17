class NestedTernaryOperatorDemo {
	
	public static void main(String[] args) {

		int n1 = 2;
		int n2 = -1;
		int n3 = 10;


		int Largest = (n1>=n2) ? ((n1>=n3) ? n1 : n3) : ((n2>=n3) ? n2 : n3);
		System.out.println("Largest number is " + Largest + "\n");



   //  Next program


     int a = -2;
     int b = 10;

     System.out.println("Number 1 is : " + a);
     System.out.println("Number 2 is : " + b);

     int result = (a > b) ? (a + b) : (a - b);
     System.out.println("Result : " + result);


   }
}