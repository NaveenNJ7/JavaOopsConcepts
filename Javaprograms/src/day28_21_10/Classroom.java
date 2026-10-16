package day28_21_10;

public class Classroom implements Student {
	
	@Override
	public void std(int standard) {
		
		System.out.println("Studying in "+standard+("th"));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Student name is "+Student.name);
		
		Classroom cls = new Classroom();
		
		cls.std(7);
	}

}
