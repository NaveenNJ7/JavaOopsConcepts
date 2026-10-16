package day26_18_10;

public class Compiler {

	
	void m() {
		
		System.out.println("Complile time polymorphism");
	}
	
	void m(int date) {
		
		System.out.println("Started on 18-10-"+date);
	}
	
	void m(String deadline, int date) {
		
		System.out.println(deadline+" to finish it on 18-10-"+date);
	}
}
