package com;

public class StringToChar {

	
	public static void main(String[] args) {
		
		String s="Success"; 
		char[] c=s.toCharArray();
	
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
		System.out.println("Reverse order");
		
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.println(c[i]);
		}
	}
}
