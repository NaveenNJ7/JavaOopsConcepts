package Automobile;

public class Test {

	// Hierarchical 
	public static void main(String[] args) {
		
		Car cr = new Car();
		System.out.println("Car details");
		cr.C();
		System.out.println("Cost : "+cr.ccost);
		
		System.out.println("---------");
		
		Bike bk = new Bike();
		System.out.println("Bike details");
		bk.B();
		System.out.println("Bike cost : "+bk.bcost);
	}
}
