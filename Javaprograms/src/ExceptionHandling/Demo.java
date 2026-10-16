package ExceptionHandling;

import java.util.Scanner;
public class Demo {

	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		
		int a = scan.nextInt();
		
		System.out.println("Enter value of b");
		
		int b = scan.nextInt();
		
		System.out.println("a divided by b : "+a/b);
		
		System.out.println("Enter value of c");
		
		int c = scan.nextInt();
		
		System.out.println("Enter value of d");
		
		int d = scan.nextInt();
		
		try
		{
		System.out.println("c divided by d :"+c/d);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cant divide any number by zero");
		}
		
	}
}
