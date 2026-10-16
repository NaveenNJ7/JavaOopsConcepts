package day23_14_10;

public class narrowingexp {

	
	public static void main(String[] args) {
		
		// narrowing - converting bigger to smaller - happens explicitly
		
		long a = 1234567L;
		
		int b = (int) a;
		
		System.out.println("Value of a :"+a);
		
		System.out.println("Value of b :"+b);
		
		System.out.println("----------------------");
		
		double c = 10001.25;
		
		int d = (int) c;
		
		System.out.println("Value of c :"+c);
		
		System.out.println("Value of d :"+d);
		
		System.out.println("----------------------");
		
		
		double e = 1234567.123456789111111;
		
		long f = (long) e;
		
		System.out.println("Value of e :"+e);
		
		System.out.println("Value of f :"+f);
		
		long z = 123456789l;
		
		float y =  z;
		
		System.out.println("Value of y : "+y);
				
    }
}
