package Company;

public class Test {

	
	void display(Employee emp)
	{
		emp.work();
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.display(new Developer());
		t.display(new Tester());
		
		
		
		
		
		
	}
}
