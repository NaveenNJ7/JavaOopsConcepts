package com;

import java.util.Scanner;

public class Multiplication {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a = s.nextInt();
		
		System.out.println("Enter value of b");
		int b = s.nextInt();
		
		System.out.println("Multiplication of a "+a+" and b "+b+" is "+(a*b));
		
		s.close();
	}
}
