package University;

public class Student extends College{

	@Override
	void col()
	{
		super.col(); // we can write anywhere within the method
		System.out.println("Student name :Arun");
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.col();
	}
	
	
}
