package DataConversion;

public class PrimitiveToString {

	public static void main(String[] args) {
		
		
		int i = 10;
		double d = 10.5;
		char c = 'A';
		boolean b = false; //true
		
		String I = String.valueOf(i);
		System.out.println(I);
		
		System.out.println(String.valueOf(20));
		
		System.out.println(String.valueOf(d));
		
		System.out.println(String.valueOf(c));
		
		System.out.println(String.valueOf(b));
	}
}
