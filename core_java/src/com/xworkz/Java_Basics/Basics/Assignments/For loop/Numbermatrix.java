class Numbermatrix {
	
	public static void main(String args[]) {

		int n = 2;

		for(int i=1; i<=n; i++) {

			for(int j=2; j<=8; j=(j+2)) {

                
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
