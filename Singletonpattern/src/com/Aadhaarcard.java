package com;

public class Aadhaarcard {

	private static Aadhaarcard ac;
	
	private Aadhaarcard()
	{
		System.out.println("Aadhaar card created");
	}
	
	public static void display()
	{
		if(ac==null)
		{
		 ac = new Aadhaarcard();
		}
		else
		{
			System.out.println("Only one person can have one Aadhaar card");
		}
	}
}
