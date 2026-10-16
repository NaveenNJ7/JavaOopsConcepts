package day15_06_10;

public class Person {
	
	int age ;
	
	String name;
	
	Person(int a, String n)
	{
		age = a;
		name = n;
	}
	
	public static void main(String[] args) {
		
		Person p0 = new Person(20, "Madhuri");
		
		Person p1 = new Person(18, "Naveen");
		
		System.out.println("Name : "+p0.name+" and age : "+p0.age);
		
		System.out.println("Name : "+p1.name+" and age : "+p1.age);
	}
}
