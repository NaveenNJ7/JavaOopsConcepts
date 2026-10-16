package Runtime;

public class Test {

	
	public static void main(String[] args) {
		
		Father f;
		
		f = new Son(); // son calling father method using super key 
		f.family();
		
		f = new Daughter();
		f.family();
		
		
		
	}
}
