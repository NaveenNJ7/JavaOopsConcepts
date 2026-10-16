package comparator;

import java.util.Comparator;

public class comparatorbyage implements Comparator<Student> {
	
	public int compare(Student x, Student y) // Stu x = object to be inserted =13
	{										 // stu y = already existing object =11
		return x.age - y.age;
	}

}
