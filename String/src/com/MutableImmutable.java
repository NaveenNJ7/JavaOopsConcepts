package com;

public class MutableImmutable {

	
	public static void main(String[] args) {
		
		String s="Java";
		
		System.out.println(s.concat(" Selenim"));
		
		System.out.println(s);
		
		System.out.println("-----------------");
		
		//even though we concat and string value wont change -> immutable -> wont change
		
		StringBuffer b=new StringBuffer("Java");
		b.append(" Selenium");
		System.out.println(b); //mutable in nature
		
		//append is method in StringBuffer use for concatenation
		
		StringBuilder bl=new StringBuilder("Java");
		bl.append(" Selenium");
		System.out.println(bl); //mutable in nature
		
	
		String email = "naveen@gmail.com";

		System.out.println(email.substring(7));
		
		
		
	}
}
