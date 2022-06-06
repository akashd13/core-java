class Nestedforloop {
	
	public static void main(String[] args) {

		int a=3;
		int b=5;

		for(int i=0 ; i<a ; i++) {

			System.out.println(i  + "th  Iteration ");

			for(int j=0; j<b ; j++) {

				System.out.println(" Hi " + j);
			}
		}
	}
}