package comparator;

import java.util.Comparator;

public class SortLabourByName  implements Comparator<Labour>{

	public int compare(Labour x, Labour y)
	{
		return x.name.compareTo(y.name);
	}
	
}
