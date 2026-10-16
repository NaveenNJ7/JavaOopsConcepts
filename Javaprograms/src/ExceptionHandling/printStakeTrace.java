package ExceptionHandling;

public class printStakeTrace {

	
	public static void main(String[] args)
	{
		System.out.println("Start");
		try {
			
		System.out.println(10/0);   
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace(); // this method will give complete information about the exception i.e 
		}						 // 1) name of the exception
								 //	2) message of interruption
		System.out.println("End");
	}
}
