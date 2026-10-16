package Equalsmethod;

public class Student {

	
	int age;
	
	Student(int age)
	{
		this.age = age;
	}
	
	
	public static void main(String[] args) {
	
		Student s1 = new Student(20);
		Student s2 = new Student(20);
		
		/*
		 
		 Comparing two objects reference without overriding equals method
		 here (==) and equals(), internally both they compare address hashcode of the objects,
		 but each object will have different address and hashcode, so answer will be false.
		 
		 s1 object is getting compare with object s2
		 s1 is calling equals method to compare with s2
		 
		 */
		
		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2)); // false
		
		
		
	}
	
	
}
