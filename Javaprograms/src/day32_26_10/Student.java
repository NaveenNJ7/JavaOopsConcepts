package day32_26_10;

public class Student {

	
	int age;
	double height;
	
	Student(int age, double height)
	{
		this.age = age;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Student s = (Student) obj;
		return this.age == s.age && this.height == s.height;
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(20, 5.4);
		Student s2 = new Student(20, 5.4);
		
		System.out.println(s1==s2);      // false here it compares string representation(address) in order to avoid this
		System.out.println("----or----"); // we need to override the equals method
		System.out.println(s1.equals(s2));
		
		
	}
}
