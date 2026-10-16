package ExceptionHandling;

public class Stringconversion {

	
	public static void main(String[] args) {
		
		String N = "Naveen Junja";
		
		char[] n = N.toCharArray();
		
		// length of the array is 12 including space
		
		System.out.println("Traverse");
		
		for(int i=0; i<n.length; i++)
		{
			System.out.println(n[i]);
		}
		
		System.out.println("Reverse");
		
		for(int i=n.length-1; i>=0; i--)
		{
			System.out.println(n[i]);
		}
	}
}
