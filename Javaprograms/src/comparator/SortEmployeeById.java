package comparator;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee> {

	
	public int compare(Employee x, Employee y)
	{
		return x.id.compareTo(y.id); // we can also write it as return x.id - y.id
	}								 // for compareTo method we need make int as Integer(Wrapper class)

		
	
	
}
