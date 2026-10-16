package Libraries;

public class Employee {
	
	
	// all classes in java inherits object class,
	
	@Override
	public String toString()
	{
		return"return implementations will be the output";
	}
	
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		
		System.out.println(e.toString()); // explicitly calling toString()
		System.out.println("Or");
		System.out.println(e); // implicitly calling toString
	} 

}
