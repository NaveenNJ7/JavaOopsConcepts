package Examples;

public class Person {

	int age=25;
	
	private static Person p;
	
	private Person()
	{
		System.out.println("Got married");
	}
	
	
	public static Person display()
	{
		if(p == null)
		{
		 p = new Person();
		}
		return p;
	}
}
