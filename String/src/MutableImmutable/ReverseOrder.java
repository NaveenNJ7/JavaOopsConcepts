package MutableImmutable;

public class ReverseOrder {

	public static void main(String[] args) {
		
	/*	// Approach-1 - using length() and charAt()
		String s = "NewYork";
		
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i)); // printing in same line,only print not println
			// out put - kroYweN
		}
    */
		String s = "NewYork";
		String rev ="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse of "+s+" :"+rev);
		
		
		// Approach-2 converting String to array
		
		String a = "UnitedKingdom";
		char A[] = a.toCharArray();
		
		for(int i=A.length-1; i>=0; i--)
		{
			System.out.print(A[i]); //only print not println
		}
		System.out.println();
		
		String b ="Newzealand";
		String Rev = "";
		char B[] = b.toCharArray();
		
		for(int i=B.length-1; i>=0; i--)
		{
			Rev = Rev+B[i];
		}
		System.out.println("Reverse of "+b+" :"+Rev);
		
		
		// Approach - 3  StringBuffer and StringBuilder
		
		// reverse() is 
		
		StringBuffer c =new StringBuffer("Australia");
		System.out.println("Reverse of Australia :"+c.reverse());
		
		// using StringBuilder
		StringBuilder d = new StringBuilder("Europe");
		System.out.println("Reverse of Europe :"+d.reverse());
		
		
	}
}
