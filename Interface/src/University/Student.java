package University;

public class Student implements Department{

	// when class inherits interface either we have override methods or declare the class as abstract class
	
	int id = 57;
	String Sname = "Naveen";
	
	@Override
	public void dpt()
	{
		System.out.println("Department :"+Department.Dname);
	}
	
	// since Department is inheriting College (has abstract method), so need to override that method\
	@Override 
	public void uvst()
	{
		System.out.println("University :"+College.Uname);
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.uvst();
		s.dpt();
		
		System.out.println("Student name :"+s.Sname);
		System.out.println("Id :"+s.id);
		
		
	}
}
