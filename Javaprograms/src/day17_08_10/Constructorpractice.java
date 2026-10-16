package day17_08_10;

public class Constructorpractice {
	
	String name;
	
	int id;
	
	String department;
	
	Constructorpractice(String name, int id, String department){
		this.name = name;
		
		this.id = id;
		
		this.department = department;
	}
	
	void std(){
		
		System.out.println("Student name : "+this.name);
		
		System.out.println("id number : "+this.id);
		
		System.out.println("Department : "+this.department);
	}
	
	
	public static void main(String[] args) {
		
	Constructorpractice Student = new Constructorpractice("Naveen", 101, "Mechanical Engineering");
	
	Student.std();
	
	System.out.println("----------------------------------------");
	
	Constructorpractice Student1 = new Constructorpractice("Madhuri", 102, "MBBS");
	
	Student1.std();
		
	}
	
	
	

}
