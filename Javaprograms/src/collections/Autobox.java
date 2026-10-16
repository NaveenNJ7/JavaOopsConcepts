package collections;

public class Autobox {

	public static void main(String[] args) {
		
		// auto box
		int a = 10;
		
		Integer a1 = new Integer(10);
		
		System.out.println(a+" and "+a1);
		
		double b = 20.34;
		
		Double d = new Double(b);  // if we print object reference it wont give result as fully qualified address
								   // instead it gives value we passed bcoz it overridden string method
		System.out.println(b+" and "+d);
		
		// auto un box 
		Integer c = new Integer(35);
		
		int c1 = c;
		
		System.out.println(c+" and "+c1);
		
		
	}
}
