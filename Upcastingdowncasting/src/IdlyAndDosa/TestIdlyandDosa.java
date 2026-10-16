package IdlyAndDosa;

public class TestIdlyandDosa {

	//variables in idly and dosa are non static so create object for them
	public void idly(Idly i)
	{
		System.out.println("ordered one plate Idly and contains :"+i.plate+" and price :"+i.price);
	}
	
	public void dosa(Dosa d)
	{
		System.out.println("Ordered one plate Dosa and contains :"+d.plate+" and price :"+d.price);
	}
	
	public static void main(String[] args) {
		// both methods are non static so create object
		
		TestIdlyandDosa t = new TestIdlyandDosa();
		t.idly(new Idly());
		
		t.dosa(new Dosa());
	}
}
