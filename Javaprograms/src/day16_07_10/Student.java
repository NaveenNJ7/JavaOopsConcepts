package day16_07_10;

public class Student extends Collegename {

	String id = "2BA10ME057";
	
	void student(String sname)
	{
		System.out.print("Student name is "+sname);
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.student("Naveen junja");
		
		System.out.print(", Id number is "+std.id);
		
		std.college("BEC");
		
		std.universityname("VTU");
	}
}
