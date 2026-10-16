package day28_21_10;

public class Company implements Employee{
	
	@Override
	public void emp(String department) {
		
		System.out.println("Department : "+department);
	}

	
	public static void main(String[] args) {
		
		Company cmp = new Company();
		
		System.out.println("Employee name : "+Employee.name);
		
		System.out.println("Id : "+Employee.id);
		
		cmp.emp("Wrestling");
	}
}
