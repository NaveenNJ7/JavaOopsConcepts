package day23_14_10;

public class Typecastingexp {

	
	public static void main(String[] args) {
		
		// widening - smaller data to bigger data (Happens implicitly)
		
		byte a = 10;
		
		int b = a;
		
		System.out.println("Value of a is : "+a);
		
		System.out.println("Value of b is : "+b);
		
		System.out.println("------------------");
		
		int c = 20;
		
		long d = c;
		
		System.out.println("Value of c :"+c);
		
		System.out.println("Value of d :"+d);
		
		System.out.println("------------------");
		
		
		// non decimal values to decimal values
		
		int e = 20;
		
		float f = e;
		
		System.out.println("Value of e :"+e);
		
		System.out.println("Here f value will store in decimal");
		
		System.out.println("Value of f :"+f);
		
		System.out.println("------------------");
		
		byte g = 25;
		
		double h = g;
		
		System.out.println("Value of g :"+g);
		
		System.out.println("Here h value will store in decimal");
		
		System.out.println("Value of h :"+h);
		
		
		
		
	}
}
