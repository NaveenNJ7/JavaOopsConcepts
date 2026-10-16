package com;

import java.util.Scanner;

public class Testevenodd {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Evenodd num = new Evenodd();
		
		for(int i=1; i<=3; i++)
		{
			System.out.println("Enter the number");
			int n = s.nextInt();
			num.m(n);
		}
		s.close();
	}
	
}
