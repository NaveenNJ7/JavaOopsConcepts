package com;

public class Student {

	// class can also act as datatype, so Student is data type
	// default value for non primitive data type is null, 
	// string is class its default value null
	
	
	private static Student s;
	// private because we should not access it outside directly, so it is private
	// we can also write this private static Student s = null;
	// why we are declaring Student as static because method is static 
	
	private Student()
	{
		System.out.println("Student Details");
		
	}
	
	// here method is static because suppose if it is non static, 
	// we need to create object for non static, that is not possible here
	public static void m()
	{
		if(s == null)       // for second calling method, s will store address ox1 so s =!null object will create
		{
			s=  new Student();
		}
		else
		{
			System.out.println("Not available Student details");
		}
	}
	
	
}

/*
 initialy s is null, after creating object, object will store some address
 s-null-ox1
 
 static will store only when class loading time
 but non static will loaded when object created
 */
