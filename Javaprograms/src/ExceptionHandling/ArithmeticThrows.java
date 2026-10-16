package ExceptionHandling;

public class ArithmeticThrows {

	
	static void m() throws ArithmeticException  // or we can write directly Exception
	{
		System.out.println(10/0);     // for unchecked exceptions it not required to write throws exception with method
	}								  // it works fine 
	
	public static void main(String[] args)
	{
		try {
		m();
		}
		
		catch( ArithmeticException e)
		{
			System.out.println("Handled");
		}
	}
}
