package Pactice;

public class TestFSD {

	public static void main(String[] args) {
		
		// normal object to acces properties of Father
		Father f; 
		f = new Father();
		f.bike();
		
		// upcasting to son
		f = new Son();
		f.bike();      // always overridden method implementations will get executed
		
		// upcasting to daughter
		f = new Daughter();
		f.bike();     // which method will get executed depends on subclass acting upon it
		
		
		
		
		
		
	}
}
