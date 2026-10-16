package day3;

public class Practice_Operators_Datatype {
	
	public static void main(String args[])
	{
		
		//byte, short, int, long 
		 
		byte a = 10;
		
		Short b = 200;
		
		int c = 30;
		
		int c1 = 20;
		long d = 123456789546232L; // Here we need to mention character L ( upper or lower ) at end of the number
		
		float e = 10.10f;   //  Here we need to mention character f at end of the number
		
		double f = 20.20;
		
		char  a1 = 'A';
		
		String A = "Java";
		
		// operators 
		// arithmetic +,-,*,/,=
		
		int a2 = a+b;
		
		System.out.println("Arithmetic");
		System.out.println("Sum of a and b is"+" "+a2); // result = 210
		
		System.out.println((b/a)); // result 20
		
		System.out.println(b%a); // result 0
		
		System.out.println((c=c1)); 
		
		System.out.println(c);
		
		System.out.println("-----------");
		
		
		// Comparison / relational 
		
		String cr = "Comparison";
		
		System.out.println(cr);
        
		
		System.out.println(a>b); // false
		
		System.out.println(f>a); // true
		
		System.out.println(a>=b);
		
		System.out.println(a==b); // false
		
		System.out.println(a!=c); // 
		
		System.out.println("-------------");
		
		
		System.out.println("logical operators");
		
		
		// Logical operators &&, || , !
		
		a = 20;
		b = 30;
		
		boolean a5 = a<b;
		boolean a6 = b>a;
		
		System.out.println(a5&&a6); // true
		
		boolean a7 = a>b;
		boolean a8 = a<b;
		
		System.out.println(a7||a8); // true
		
		System.out.println(!a7); // true
		
		System.out.println("----------------");
		
		
		// increment and decrement 
		
		System.out.println("Increment and decrement");
		
		
		a = 15;
		
		a++;
		
		System.out.println(a);
		
		int a9 = ++a; 
		int a10 = --a;
		
		 boolean a11 = a9>a; // false
		 boolean a12 = a10>a9; // false
		
		System.out.println(a9); // 17
		
		System.out.println(a12&&a11); // false
		
		
		System.out.println("-----------------");
		
		
		System.out.println("Assignent");
		
		a = 10;
		
		int z = 50;
		
		a+=80;
		
		z-=20;
		
		System.out.println(a/z); // 3
		
		a = 10;
		
		a%=2;
		
		System.out.println(a); // 0
		
		
		System.out.println("------------------");
		
		System.out.println("Ternary");
		
		// Ternary
		// syntax variable = expression?result1:result2;
		
		
		int officetime = 9;
		
		int punchtime = 10;
		
		int punchtime1 = 11;
		
		int punchtime2 = 1;
		
	    String logintime = punchtime>officetime?"1 hour permission":"LOP";
		
	    System.out.println(logintime);
	    
	    String logintime1 = punchtime1>officetime?"2 hour permission":"LOP";
	    
	    System.out.println(logintime1);
	    
	    
	    String logintime2 = punchtime2<officetime?"LOP":"Halfday";
	    
	    System.out.println(logintime2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
