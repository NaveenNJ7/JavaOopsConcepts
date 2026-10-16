package day33_27_10;

public class Employee {

	int id;
	double height;
	
	Employee(int id, double height)
	{
		this.id = id;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee emp = (Employee) obj;
		return this.id==emp.id && this.height==emp.height;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(new Employee(01, 5.6).equals(new Employee(01, 5.6))); // these two are different objects
		
		Employee e1 = new Employee(01, 5.5);
		Employee e2 = new Employee(02, 5.5);  //these two are different objects
		
		if (e1.equals(e2))
		{
			System.out.println("Both employee have same height and id");
		}
		else
		{
			System.out.println("Both employee dont have same height and id");
		}
	}
}
