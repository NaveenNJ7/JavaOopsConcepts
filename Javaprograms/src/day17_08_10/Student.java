package day17_08_10;

public class Student {

	
	Student(String name){
		
		System.out.println("Name : "+name);
	}
	
	Student(int id, String department){
		
		this("Naveen junja");
		System.out.println("id number : "+id);
		System.out.println("Department : "+department);
	}
	
	Student(String college, String university){
		
		this(352, "Mechanical engineerng");
		System.out.println("College : "+college);
		
		System.out.println("University : "+university);
	}
	
	public static void main(String[] args) {
		 
	   Student std = new Student("Basaveshwar engineering college", "VTU");
	}
}
