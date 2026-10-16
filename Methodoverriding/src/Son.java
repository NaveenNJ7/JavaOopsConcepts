
public class Son extends Father {

	
	@Override
	void f()
	{
		System.out.println("New bike");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.f();
		
	}
}
