package com;

public class Testfatherson {
 
	// single IS-A 
	
	public static void main(String[] args) {
		
		Son s = new Son();
		
		System.out.println("Father name :"+s.fname+" and his age is :"+s.fage);
		System.out.println("Son name :"+s.sname+" and his age is :"+s.sage);
	}
}
