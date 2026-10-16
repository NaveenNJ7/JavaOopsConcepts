package ExceptionHandling;

public class getMessage {

	
	public static void main(String[] args) {
		
		System.out.println("Start");
		try {
		System.out.println(10/0);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage()); // get message will give only information about the reason for the exception
		}
		
		System.out.println("End");
	}
}
