package ExceptionHandling;

import java.util.Scanner;

public class Testinvalidageexception {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter age of the person");
		
		int age = scan.nextInt();
		
		if(age>=21)
		{
			System.out.println("Eligible for license");
		}
		
		else
		{
			try
			{
				throw new InvalidageException("Not eligible for license");
			}
			
			catch(InvalidageException a)
			{
				System.out.println(a.getMessage());
			}
		}
	}
}
