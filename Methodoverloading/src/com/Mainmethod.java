package com;

public class Mainmethod {
	
	public static void main(String[] args) {
		
		System.out.println("Always execution starts from main method which accept String[] arguments");
		main(10);
		main(10.5);
		
		// Here methods are static so no need to create object, only for non static
	}
	
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(double b) {
		System.out.println(b);
	}

}
