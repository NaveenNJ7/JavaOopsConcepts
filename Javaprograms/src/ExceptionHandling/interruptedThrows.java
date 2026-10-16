package ExceptionHandling;

public class interruptedThrows {

	
	static void m1() throws InterruptedException  // for checked exceptions we need to add throws Exceptions with method 
												  // for to give indication to caller
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			
			Thread.sleep(2000);
		}
	}
		public static void main(String[] args)
		{
		try
		{
			m1();
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Working");
		}
		
		
	}
}
