package Pactice;

public class CompilePractice {

	void m(String name)
	{
		System.out.println("College name :"+name);
	}
	
	void m(String name, int id) // change is number of arguments and change in data type
	{
		System.out.println("Student name :"+name+" id :"+id);
	}
	
	void m(int id, String name) // change in sequence of arguments
	{
		System.out.println("Class :"+id+" floor :"+name);
	}
}
