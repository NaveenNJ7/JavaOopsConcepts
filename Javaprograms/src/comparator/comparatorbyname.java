package comparator;

import java.util.Comparator;

public class comparatorbyname implements Comparator<Student> {
	
	public int compare(Student x, Student y) // Student x = object to be inserted
	{										 // Student y = already existing object
		return x.name.compareTo(y.name);
	}

}
