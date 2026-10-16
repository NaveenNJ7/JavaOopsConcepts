package ExceptionHandling;

import java.util.Scanner;
public class Testcalculator {

	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		Calculator cal = new Calculator();
		
		
		
		while(true)
		{
		System.out.println("Operations\n1.Addition\n2.Difference\n3.Multiplication\n4.Divided\n5.Exit");
		int choice = scan.nextInt();
		int a =0;
		int b =0;
		if(choice >= 1 && choice <= 4)
		{
		System.out.println("Enter the value of a");
		
		 a = scan.nextInt();
		
		System.out.println("Enter the value of b");
		
		 b = scan.nextInt();
		}
		switch(choice)
		{
		case 1:
			int sum = cal.add(a, b);
			System.out.println("sum = "+sum);
			break;
			
		case 2:
			int diff = cal.diff(a, b);
			System.out.println("Diff = "+diff);
			break;
			
		case 3:
			int mult = cal.mul(a, b);
			System.out.println("Mul = "+mult);
			break;
			
		case 4:
			  // int divd = cal.div(a,b) we can also write like this
			
			System.out.println("Divid = "+cal.div(a, b));
			break;
			
		case 5: System.out.println("Thank you");
		System.exit(0);
			
			default: System.out.println("Invalid");
			
			
			
		}
		
		
		}	
		
		
		
	}
}
