package day30_23_10;

public class Student {
	
	String name;
	
	int rollnumber;
	
	Student(String name, int rollnumber){
		
		this.name=name;
		this.rollnumber=rollnumber;
	}
	
	@Override
	
	public String toString()
	{
		return name+" and his Roll number is "+rollnumber;
	}
	
	public static void main(String[] args) {
		
		Student s = new Student("Vinayak Shankarpalle", 111);
		
		System.out.println(s.toString());
	}
	


}
