package com;

public class Employee {

	
	static String name = "John";
	
	static void m() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Employee name : "+Employee.name);
		Employee.m(); // with class name
		
		System.out.println("=======");
		
		// if it is in same class we can access static properties without class name also
		System.out.println("Employee name : "+name);
		m();
	}
}
