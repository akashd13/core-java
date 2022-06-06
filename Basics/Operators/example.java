class example {
	public static void main(String args[]) {

	int a=10;
	int b=20;

	boolean c = ((++a>=++b) & ((a+b)/10>=b)) | ((a++)<(b++));
	System.out.println(c);


	}
}