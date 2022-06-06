class star {
	
	public static void main(String args[]) {

		int n = 4;

		for(int i=1; i<=n; i++) {

			for(int j=2; j<=8; j++) {

                j++;
				System.out.print("*" + " ");
			}

			System.out.println();
		}
	}
}