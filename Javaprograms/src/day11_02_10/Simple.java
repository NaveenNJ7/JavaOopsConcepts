package day11_02_10;

 class Simple {
	 
	 // method without return and without arguments
	 
	 void m1()
	 {
		 System.out.println("My name is ");
	 }
     
	 // method without return and with arguments
	 
	 void m2(String name, int a)
	 {
		 System.out.println(name+" id is number is "+a);
	 }
	 
	 //method with return and without arguments
	 
	 String m3()
	 {
		 return " & Iam working in ";
	 }
	 
	 // method with return and with arguments
	 
	 String m4(String p1)
	 {
		 return p1;
	 }
	 String p1(String p)
	 {
		 return p;
	 }
	 
	 
	 public static void main(String[] args) {
		 
		 Simple s1 = new Simple();
		 
		 s1.m1();
		 
		 Simple s2 = new Simple();
		 
		 s2.m2("Naveen S Junja", 352);
		 
		 Simple s3 = new Simple();
		 
		 String w = s3.m3();
		 
		 System.out.println(w);
		 
		 Simple s4 = new Simple();
		 
		 String c = s4.m4(" & Iam getting salary 15 thousand");
				 
	     System.out.println(c);
		 Simple p = new Simple();

	     System.out.println(p.p1(" & Iam getting salary 80 thousand"));
	 }
	 
	 
}
 
