package Compiletimepolymorphism;

public class Examples {

	
	void m()
	{
		System.out.println("Overloading Rules");
		System.out.println("Change in no of arguments\nChange in Datatype of args\nchange in sequnce of datatype");
	}
	
	void m(String company)
	{
		this.m();
		System.out.println("Company :"+company);
	}
	
	void m(String name, int id)
	{
		this.m("SW");
		System.out.println("Employee name :"+name+"\nId :"+id);
	}
	
	void m(int salary)
	{   
		this.m("Navin", 352);
		System.out.println("Salary :"+salary);
	}
	
	
	
	
	
	
	
	
}
