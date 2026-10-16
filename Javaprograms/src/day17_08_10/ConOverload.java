package day17_08_10;

public class ConOverload {
	
	ConOverload(String Ename, int sal){
		System.out.println("Name : "+Ename+" & Salary : "+sal);
	}
	
	ConOverload(String Ename){
		System.out.println("Name : "+Ename+" & Intern");
	}
	
	ConOverload(String Ename, double sal){
		System.out.println("Name : "+Ename+" & Salary : "+sal);
	}
	
	ConOverload(int sal, String Ename){
		System.out.println("Salary : "+sal+" & Name : "+Ename);
	}
	
	
	public static void main(String[] args) {
		
		ConOverload Emp0 = new ConOverload("Mahes", 30000);
		
		ConOverload Emp1 = new ConOverload("Hitesh");
		
		ConOverload Emp2 = new ConOverload("Ramesh", 25000.55);
		
		ConOverload Emp3 = new ConOverload(20000, "Roopesh");   // we can also write it has new ConOverload(arguements) but here
																// that object does have any name
		System.out.println("-------------------------------");
		
		new ConOverload(20000,"Roopesh");
	}

}
