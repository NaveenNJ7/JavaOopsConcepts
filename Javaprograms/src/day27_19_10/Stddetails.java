package day27_19_10;

public class Stddetails extends Stdclass {

	@Override
	void std(String name) {
		System.out.println("Student name : "+name);
	}
	
	@Override
	void standard() {
		System.out.println("7th standard");
	}
	
	public static void main(String[] args) {
		
		Stddetails stu = new Stddetails();
		
		stu.std("Vin desiel");
		stu.standard();
		stu.stdID(45);
		
	

	
	}
	
}
