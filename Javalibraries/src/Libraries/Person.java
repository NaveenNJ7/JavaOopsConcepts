package Libraries;

public class Person {

	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println(p);
		System.out.println(p.toString()); // both are same inheriting object class 
		
		/*
		 here if we print object reference we will get string representation of object
		 or object is converting to string, internally it calls toString() method
		 the default implementation of the toString() will get executed that is fullyqualifiedclassname
		 if we override the toString() it will return overridden String implementations
		 
		 
		 */
		
	}
}
