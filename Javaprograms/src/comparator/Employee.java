package comparator;

public class Employee {

	
	String name;
	Integer id;
	Double salary;
	
	Employee(String name, int id, double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;			
	}
	
	public String toString()
	{
		return "Name of Employee : "+name+"/  id : "+id+"/  Salary : "+salary;
	}
	
	
}
