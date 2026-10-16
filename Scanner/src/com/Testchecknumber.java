package com;

import java.util.Scanner;

public class Testchecknumber {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Checknumber ch = new Checknumber();
		
		for(int i=1; i<=3; i++) {
			
			System.out.println("Enter number check whether it is Positive or Negative");
			int n = s.nextInt();
			ch.m(n);
		}
		s.close();
	}
}
