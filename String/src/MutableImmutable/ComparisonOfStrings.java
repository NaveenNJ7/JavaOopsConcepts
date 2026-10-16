package MutableImmutable;

public class ComparisonOfStrings {

	public static void main(String[] args) {
		
		// case-1 - string variables
		String s = "Do well";
		String s1 = "Do well";
		System.out.println(s==s1);        //true
		System.out.println(s.equals(s1)); //true
		
		
		// case-2 - created object of string
		String s2 = new String("Must do");
		String s3 = new String("Must do");
		System.out.println("2---------2");
		System.out.println(s2==s3);       //false - compares the objects(s2 and s3 are different)
		System.out.println(s2.equals(s3));//true - compares the values of object(Must do both are same)
		
		
		// case-3 variable and object
		String s4 = "Hard work";
		String s5 = new String("Hard work");
		System.out.println("3---------3");
		System.out.println(s4==s5);  // false - compares the objects
		System.out.println(s4.equals(s5)); // true - compares value
		
		/*
		 whenever we create objects, if we compares references using == it will give false
		 if we compares using equals() it will give true (if have same values)
		 */
		
		
		//case-4 variable, object and object assigned to another variable
		String s6 = "Consistent";
		String s7 = new String("Consistent");
		String s8=s7;
		
		System.out.println("4---------4");
		//s8 also refering same object
		System.out.println(s6==s7); // false
		System.out.println(s6.equals(s7)); // true
		
		System.out.println(s7==s8); // true
		System.out.println(s7.equals(s8)); // true
		
		System.out.println(s6==s8); // false
		System.out.println(s6.equals(s8)); // true
		
	}
}
