package ExceptionHandling;

public class finallyblock {

	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
		System.out.println(10/0);
		}
		
		catch(ClassCastException e)
		{
			System.out.println("Invalid");
		}
		
		finally
		{
			System.out.println("whether exception occurs or not always finally block will get always executed");
		}
		
		System.out.println("End");
	}
}
