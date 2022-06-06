class IncrementAssignment {
	
	static public void main(String[] args) {

		float x = 10f;
		float y = x++;

		System.out.println(++y);  //11
		System.out.println(++x);  //12
		System.out.println(x);    //12
		System.out.println(y);    //11
		System.out.println((++y) + (x++));  //24
		System.out.println(--y);  //11
		System.out.println(--x) ; //12
		System.out.println((--y) * (x));  //120    
		System.out.println((y) - (--x));  //-1     
		System.out.println(y / (++x));  //3       
		System.out.println(x++);  //12             
		System.out.println(x % y + "\n" + "\n" + "\n");  //3           





       int m = 500;
       int n = 600;

       System.out.println(n++);  //600
       System.out.println(++m);  //501
       System.out.println(++m);  //502
       System.out.println(++n);  //602
       System.out.println(m);    //502
       System.out.println(n);    //602

	}
}