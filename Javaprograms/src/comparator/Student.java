package comparator;

public class Student {

	int age;
	String name;
	
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "Name of the Student : "+name+" and age : "+age;
	}
	
}

