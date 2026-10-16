package comparator;

import java.util.TreeSet;

public class sortemployee {

	
	public static void main(String[] args) {
		
		SortEmployeeById Id = new SortEmployeeById();
		SortEmployeeByName Name = new SortEmployeeByName();
		SortEmployeeBySalary Salary = new SortEmployeeBySalary();
		
		TreeSet<Employee> t = new TreeSet<Employee>(Salary);
		
		
		t.add(new Employee("Anji", 15, 20.25));
		t.add(new Employee("anji", 11, 20.15));
		t.add(new Employee("Rajak", 13, 20.45));
		t.add(new Employee("Gopali", 17, 20.35));
		
		for(Employee Emp: t)
		{
			System.out.println(Emp);
			System.out.println("---------------");
		}
	}
}
