package office;

public class Product extends Work implements Developer, Tester {

	@Override
	public void dev()
	{
		System.out.println(Developer.d+" Writting codes");
	}
	
	@Override
	public void test()
	{
		System.out.println(Tester.t+" Writting test script");
	}
	
	public static void main(String[] args) {
		
		/*
		class can extends only one class and can implements multiple interfaces 
		*/
		
		Product p = new Product();
		p.working();
		p.dev();
		p.test();
		
		
		
	}
}
