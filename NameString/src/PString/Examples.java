package PString;

public class Examples {

	
	public static void main(String[] args) {
		
		Examples e1 = new Examples();
		Examples e2 = new Examples();
		
		System.out.println(e1);   // we get string representation
		System.out.println(e1.hashCode()); // every object will have unique id number
		
		System.out.println("----------");
		
		String s1 = new String("Overridden toString()"); // toString() present in the object class 
		String s2 = new String("overridden toString()"); // o is lower case
		
		System.out.println(s1); 
		
		System.out.println("----------");
	//we can also write
		System.out.println(s1.toString());
		
	// without passing any arguments in String class, we get empty 
		
		// equals() - compare the content we passed, java is case sensitive
		
		System.out.println(s1.equals(s2)); // false o is lower case
		 
		System.out.println(e1.equals(e2)); // false it compares hashcodes
		
		String s3 = new String("A");
		System.out.println(s3.toString());
		System.out.println(s3.hashCode());
		
		String s4 = new String("AB");
		System.out.println(s4);
		System.out.println(s4.hashCode());
		
		
		/* Object have 3 classes
		 1)toString()	2)equals()	3)hashCode()
		 
		 String class overridden these methods from object class
		 
		 */
		
	}
}
