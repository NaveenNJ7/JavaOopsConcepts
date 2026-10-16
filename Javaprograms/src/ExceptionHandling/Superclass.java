package ExceptionHandling;

public class Superclass {

	
	public static void main(String[] args)
	{
		try {
		System.out.println(20/0);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid");
		}
		catch(NullPointerException e)
		{
			System.out.println("Not divided by zero");
		}
		catch(Exception e)
		{
			System.out.println("We can write superclass(Exception), i.e upcasting\nException e = new AE();");
		}
		
	}
}
