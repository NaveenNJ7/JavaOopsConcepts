package comparator;

public class Labour {

	
	String name;
	Double salary;
	
	Labour(String name, Double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return name+" "+salary;
	}
}
