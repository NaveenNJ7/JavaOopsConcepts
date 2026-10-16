package com;

public class Overridding {

	
	public static void main(String[] args) {
		
		/* 
		 if we print object reference s, we should get String representation or fully qualified class
		 but here in String class it will automatically override toString() and return the content we 
		 passed to the constructor
		*/
		String s = new String("Java");
		System.out.println(s);
		System.out.println(s.toString());
	    System.out.println("-------");
	    
	    /*
	     if we print s1 it should give hashcode value of object but here in class we will get
	     ASCII value
	     */
	    String s1 = new String("A");
	    System.out.println(s1.hashCode());
	    
	    System.out.println("-------");
	    
	    /*
	     if we pass some contents to constructor and call the equals methods, internally it will compare the
	     address and hashcode of the content but in String class it will override the equals method
	     and compare the content we passed to the constructor
	     */
	    String s2 = new String("JAVA");
	    String s3 = new String("Java");
	    System.out.println(s2.equals(s3)); // false
	    
	    
	}
}
