package day15_06_10;

public class Exmple1 {

	// not accepting any parameters or arguments
	// non parameterized custom constructor
	Exmple1()
	{
		System.out.println("Class name and constructor name should always same");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Today session is about Constructors");
		
		Exmple1 E = new Exmple1();
		
		System.out.println("They get executed during object creation");
		
	}
}
