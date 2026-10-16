package ExceptionHandling;

import java.util.Scanner;

public class TestcustomException {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username");
		
		String name = scan.next();
		
		System.out.println("Enter password");
		
		int password = scan.nextInt();
		
		if(name.equals("Ratan"))
		{
			if(password == 8497)
			{
				System.out.println("Login successfull");
			}
			else
			{
				try
				{
					
					customException ce = new customException();
					  				// (or) \\
					//throw new customException();
				}
				catch(customException ce)
				{
					System.out.println("Invalid password");
				}
			
			}
		}
	}
	
	
}
