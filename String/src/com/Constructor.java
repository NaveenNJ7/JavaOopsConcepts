package com;

public class Constructor {

	
	public static void main(String[] args) {
		
		// empty representation of the String object
		String s = new String(); // it look like String a = "";
		System.out.println();
		
		System.out.println("------");
		
		// passing set of characters
		String s1 = new String("mava");
		System.out.println(s1);
		
		System.out.println("-------");
		
		// converting char[] into String object
		char[] a = {'N','a','v','e','e','n'};
		String s2 = new String(a);
		System.out.println(s2);
		
		
		
	}
	
	
	
	
}
