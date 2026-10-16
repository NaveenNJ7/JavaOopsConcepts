package collections;

import java.util.ArrayList;

public class Testemployee {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("viru", 01);
		Employee e2 = new Employee("Dada", 02);
		Employee e3 = new Employee("Sachin", 03);
		
		System.out.println(e1.name+" and "+e1.id);
		System.out.println(e1); // bcoz of overridden of toString() we dont get fullyqualified class
		
		ArrayList<Employee> emp = new ArrayList();
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		System.out.println("Objects prersent in Employee : "+emp);
		
		for(Employee e: emp)
		{
			System.out.println(e);
		}
	}
}
