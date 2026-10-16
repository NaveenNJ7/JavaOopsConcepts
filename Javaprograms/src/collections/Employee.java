package collections;

public class Employee {

	
	String name;
	int id;
	
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
    public String toString()
    {
    	return "Emp name : "+name+", Emp id : "+id;
    }
    
}
