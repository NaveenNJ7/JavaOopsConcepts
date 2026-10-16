package Stroingobjects;

public class Student {

	
	String name;
	int std;
	
	// alt+shift+s short cut key
	
	Student(String name, int std) {
		this.name = name;
		this.std = std;
	}
	
	@Override
	public String toString()
	{
		return "Name :"+this.name+" and studying in "+this.std+"th class";
	}
	
	public static void main(String[] args)
	{
		
		Student s1  = new Student("Shan", 7);
		Student s2  = new Student("Ron", 8);
		Student s3  = new Student("Pan", 9);
		
		Student[] s = new Student[3];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		
		
	}
	
	
	
}
