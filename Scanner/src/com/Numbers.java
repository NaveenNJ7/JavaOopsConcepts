package com;

import java.util.Scanner;

public class Numbers {

	void m(int a, int b) {
		System.out.println("sum of a :"+a+" and b :"+b+" is "+(a+b));
		System.out.println("Substraction of a :"+a+" and b :"+b+" is "+(a-b));
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Numbers n = new Numbers();
		
		System.out.println("Enter the value of a");
		int a = s.nextInt();
		
		System.out.println("Enter the value of b");
		int b = s.nextInt();
		n.m(a, b);
		s.close();
	}
	
}
