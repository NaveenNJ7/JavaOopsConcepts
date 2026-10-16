package Examples;

public class Student {

	
	int age;
	double height;
	
	
	Student(int age, double height) {
		this.age = age;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		// instead of s here we can write s2 also s2=obj=downcast to subclass=s2 only
		// if s2.equls(s1) instead of s we can write s1
		// s1 and s2 are specialization and s is generalization
		
		Student s = (Student) obj;
		return this.age ==s.age && this.height ==s.height;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(7, 4.5);
		Student s2 = new Student(7, 4.5);
		
		System.out.println(s1.equals(s2));
		
		System.out.println("--------");
		
		System.out.println(new Student(5, 5.4).equals(new Student(4, 5.4)));
		
		System.out.println("---------");
		
		// we can also write using if condition
		
		if(new Student(3,4.4).equals(new Student(3, 4.4)))
		{
			System.out.println("Content are same");
		}
		else
		{
			System.out.println("Contents are not same");
		}
		
	}
	
}
