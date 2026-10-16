package day31_25_10;

public class Employee {

	String name;
	int id;
	String department;
	String company;
	
	Employee(String name, int id, String department, String company)
	{
		this.company = company;
		this.name = name;
		this.id = id;
		this.department = department;
	}
	
	@Override
	public String toString()
	{
		return "Employee name : "+name+"\nId :"+id+"\nDepartment : "+department;
	}
	
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee("Ram", 01,"Backend dev","Universe");
		Employee emp2 = new Employee("Krsih", 02, "Frontend dev","Universe");
		Employee emp3 = new Employee("Arjun", 03, "Tester","Universe");
		
		Employee[] emp = new Employee[3];
		 emp[0] = emp1;
		 emp[1] = emp2;
		 emp[2] = emp3;
		 
	/*	 System.out.println(emp[0]);  // without creating override
		 System.out.println(emp[1]);
		 System.out.println(emp[2]); */
		 
		 System.out.println("Company name");
		 System.out.println(emp[0]);
		 System.out.println(emp[1]);
		 System.out.println(emp[2]);
		 
		 System.out.println("------OR------");
		 
		 for(int i=0; i<emp.length; i++)
		 {
			 System.out.println(emp[i]);
		 }
	}
}
