package day12_Overloading;

import java.util.Scanner;

public class Overloading3 {

	void v(int a, int b)
	{
		System.out.println("Multiple of "+a+" & "+b+" is "+(a*b));
	}
	
	public static void main(String[] args)
	{
		
		for(int i=1; i<=5; i++) {
			
		Scanner v1 = new Scanner(System.in);
		
		Overloading3 v2 = new Overloading3();
		
		System.out.println("Enter value of a");
		int a = v1.nextInt();
		
		System.out.println("Enter value of b");
		int b = v1.nextInt();
		
		v2.v(a, b);
		
		}
	}
}
