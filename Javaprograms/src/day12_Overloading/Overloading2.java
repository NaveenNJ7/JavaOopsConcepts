package day12_Overloading;

import java.util.Scanner;
public class Overloading2 {

	void check(int a, int b)
	{
		System.out.println("sum of a "+a+" and b "+b+" is "+(a+b));
	}
	
	public static void main(String[] args) {
		
		Scanner call = new Scanner(System.in);
		
		Overloading2 call1 = new Overloading2();
		
		for(int i = 1; i<=4; i++)
		{
			System.out.println("Enter value of a");
			
			int a = call.nextInt();
			
			System.out.println("Enter value of b");
			
			int b = call.nextInt();
			
			call1.check(a,b);
			
		
		}
	}
}
