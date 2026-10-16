package com;

public class comparisonString {

	
	public static void main(String[] args) {
		
		String s="John";
		String s3="John";
		String s1=new String("John");
		String s2=new String("John");
		
	
		System.out.println(s==s1); //false
		System.out.println("--------");
		System.out.println(s.equals(s1)); //ture
		System.out.println("--------");
		System.out.println(s1==s2); //false  //compare object reference or objects
		System.out.println("--------");
		System.out.println(s1.equals(s2)); //true  compare value of object
		System.out.println("--------");
		System.out.println(s==s3);
		System.out.println(s.equals(s3));
	
		/*
		 when there is String initialized with new or object
		 if we compare with == it gives false  -> compares object reference or objects
		 if we compare with equals gives true  -> compares value of object
		 
		 suppose if we initialize string without object or new
		 if compare with == and equals both gives true
		 */
		
		
	}
}
