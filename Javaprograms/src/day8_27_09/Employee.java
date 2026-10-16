package day8_27_09;

public class Employee {
	
	
	// accessing non static variables inside same class
	 
	 String name = "Naveen";
	
	// Non static variables
	  
	int Id = 352;
	
	public static void main(String[] args)
	{
		
		
		Employee E = new Employee();
		
		
		System.out.println(E.name);
		
		System.out.println(E.Id);
		
        System.out.println("OR");
        
        
        System.out.println(E.name+" Id number is "+E.Id);
		
	} 
	
	
	/* String name = "Anand";
	
	int Id = 450;
	
	
	public static void main(String[] args)
	
	{
		Employee Emp = new Employee();
		
		System.out.println(Emp.name+" took 2 hour permission today and his Id number is "+Emp.Id);
		
	} */

}
