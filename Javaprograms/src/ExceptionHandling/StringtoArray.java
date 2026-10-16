package ExceptionHandling;

public class StringtoArray {

	
	public static void main(String[] args) {
		
		System.out.println("Traverse");
		String n = "Naveen";              // lenght of the array is 6
		
		char[] N = n.toCharArray();
		
		// traverse the string
		
		for(int i=0; i<N.length; i++) 
		{
			System.out.println(N[i]);
		}
		
		// reverse the string
		
		System.out.println("reverse");
		
		for(int i=N.length-1; i>=0; i--)
		{
			System.out.println(N[i]);
		}
	}
}
