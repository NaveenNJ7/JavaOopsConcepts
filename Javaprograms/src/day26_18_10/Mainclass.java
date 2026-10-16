package day26_18_10;

public class Mainclass {

	
	void main(Employee emp) {
		
		emp.m();
	}
	
	public static void main(String[] args) {
		
		Mainclass mai = new Mainclass();
		
		mai.main(new Employee());
		mai.main(new Developer());
		mai.main(new Tester());
	}
}
