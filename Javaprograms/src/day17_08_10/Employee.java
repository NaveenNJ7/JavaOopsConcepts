package day17_08_10;

public class Employee {

	
	 Employee(String ename) {
		
		System.out.println("Employee name : "+ename);
	}
	
	Employee(int id, double salary){
		
		this("Ramesh");
		
		System.out.println("id : "+id+" Salary : "+salary);
	}
		
	public static void main(String[] args) {
		
		Employee emp = new Employee(007, 101.1);
		
		
	
	}
}
