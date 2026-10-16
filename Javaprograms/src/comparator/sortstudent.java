package comparator;

import java.util.TreeSet;

public class sortstudent {

	public static void main(String[] args) {
		
		
		
		Student s1 = new Student("Ishant", 13);
		Student s2 = new Student("Prashant", 11);
		Student s3 = new Student("Kiran", 14);
		Student s4 = new Student("Amogh", 15);
		
		comparatorbyname cmp = new comparatorbyname();
		comparatorbyage cm = new comparatorbyage();
		
		TreeSet<Student> s = new TreeSet<Student>(cm);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(new Student("John", 12));
		s.add(new Student("Basu", 16));
		
		for(Student st: s)
		{
			System.out.println(st);
		}
		
	}
}
