package comparator;

import java.util.Comparator;

public class SortLabourBySalary implements Comparator<Labour> {

	public int compare(Labour x, Labour y)
	{
		return x.salary.compareTo(y.salary);
	}
}
