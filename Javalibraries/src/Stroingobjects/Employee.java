package Stroingobjects;

public class Employee {

	String name;
	int id;
	
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Brishtesh", 35);
		Employee e2 = new Employee("Guru", 40);
		Employee e3 = new Employee("Mayur", 45);
		Employee e4 = new Employee("Navin", 57);
		
		Employee[] e = new Employee[4];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		e[3] = e4;
		
		System.out.println("Students name and id");
		
		// without overriding the toString() printing details. using dot(.) operator
		
		for(int i=0; i<e.length; i++)
		{
			System.out.println("Name :"+e[i].name+" and id :"+e[i].id);
		}
		
	}
	
	
	
}
