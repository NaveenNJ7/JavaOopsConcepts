package Company;

public class Test extends Swipe implements Developer, Tester {

	
	
	@Override
	public void dev()
	{
		System.out.println("Developing");
	}
	
	@Override
 	public void tes()
	{
		System.out.println("Testing");
	}
	
	// optionally we can override swipe
	
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		t.dev();
		t.tes();
		t.sw();
	}
}
