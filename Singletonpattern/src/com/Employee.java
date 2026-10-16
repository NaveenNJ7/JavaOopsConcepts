package com;

public class Employee {

	private static Employee e;
	
	private Employee()
	{
		System.out.println("Employee id");
	}
	
	public static void display()
	{
		if(e==null)
		{
			System.out.println(e);  // which gives null, 
		 e = new Employee();        // after creating object if we print object reference we will get fullyqualifiedclass
		 System.out.println(e); 
		}
		else
		{
			System.out.println("Employee can have only one id");
		}
	}
	
	public static void main(String[] args) {
		
		e.display();
		e.display();
		
	}
}
