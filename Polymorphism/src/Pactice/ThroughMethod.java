package Pactice;

public class ThroughMethod {

	void test(Father f)
	{
		f.bike();
	}
	
	public static void main(String[] args) {
		
		ThroughMethod t = new ThroughMethod();
		t.test(new Son());
		t.test(new Daughter());
	}
}
