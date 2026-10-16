package com;

import java.util.Scanner;

public class Additin {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value a");
		
		int a = s.nextInt();
		
		System.out.println("Enter value b");
		
		int b = s.nextInt();
		
		System.out.println("Sum of a:"+a+" and b:"+b+" is "+(a+b));
		
		s.close();
	}
}
