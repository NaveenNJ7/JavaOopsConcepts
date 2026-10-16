package com;

import java.util.Scanner;

public class Testemployee {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Employee e = new Employee();
		
		for(int i=1; i<=2; i++)
		{
			System.out.println("Enter the name of the Employee");
			String name = s.next();
			
			System.out.println("Enter the ID number of the Employee");
			int id = s.nextInt();
			
			System.out.println("Enter the Salary of the Employee");
			int Salary = s.nextInt();
		    
			e.employee(name, id, Salary);
			
		}
		s.close();
		
	}
}
