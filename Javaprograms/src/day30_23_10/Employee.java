package day30_23_10;

public class Employee {
	
	
	String name;
	int id;
	
	Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	@Override
	public String toString()
	{
		return "Employee Detalis\nName : "+name+"\nId : "+id;
	}
	
	public static void main(String[] args) {
		
		
		Employee Emp = new Employee("Bhageera", 01);
		
		System.out.println(Emp);
	}

}
