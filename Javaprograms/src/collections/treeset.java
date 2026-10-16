package collections;

import java.util.TreeSet;

public class treeset {

	
	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet(); // suppose if we add generic Integer, it allows only integers
		
		t.add(40);
		t.add(60);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(20);
		t.add(10);
		
		/* internally sorting will happen, natural sorting i.e Ascending order
		   internally it will call compareTo()
		   it wont allow duplicates.
		 */
		
		System.out.println(t);
		
		System.out.println("--------------");
		
		for(int i: t)
		{
			System.out.println(i);
		}
		
		System.out.println("--------------");
		
		// for String it works based on ASSCI value a(97) and A(65)
		
		TreeSet<String> s = new TreeSet();
		
		s.add("Banana");
		s.add("Apple");
		s.add("Cat");
		s.add("array"); // a is small so its value is 97
		
		System.out.println(s);
		
		System.out.println("--------------");
		
		for(String z: s)
		{
			System.out.println(z);
		}
		
		
		
	}
}
