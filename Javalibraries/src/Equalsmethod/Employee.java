package Equalsmethod;

public class Employee {
	
	// comparing two objects with overriding equals method
	
	int salary;
	
	Employee(int salary)
	{
		this.salary = salary;
	}
	
	@Override // when we override the method, it will compare the actual content of the objects,
	
	public boolean equals(Object obj)     
	// object is superclass, Object obj = new Employee(500); upcast(e2 object)
	{
		
		Employee e = (Employee) obj;      // downcasting 
		return this.salary == e.salary;
	}
	
    public static void main(String[] args) {
		Employee e1 = new Employee(500);
		Employee e2 = new Employee(500);
	
		System.out.println(e1.equals(e2)); // true
		
    	
	}
}
