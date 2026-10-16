package comparator;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<Employee> {

	
	public int compare(Employee x, Employee y)
	{
		return x.salary.compareTo(y.salary);
	}
}
