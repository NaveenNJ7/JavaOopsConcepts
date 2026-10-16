package ExceptionHandling;


public class ArryaIndexOutOfBoundsException {

	public static void main(String[] args)
	{
		int[] a = {10,20,30,40};
		
		System.out.println("The number in Index position 3 : "+a[3]);
		
		System.out.println("The number in Index position 2 : "+a[2]);
		
		try
		{
		System.out.println("The number in Index position 5 : "+a[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("Index 5 is out of the lenght");
		}
				
		
	}
}
