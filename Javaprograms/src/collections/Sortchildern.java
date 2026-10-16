package collections;

import java.util.TreeSet;

public class Sortchildern {

	
	public static void main(String[] args) {
		
		childern c1 = new childern(3, "Chimmi");
		childern c2 = new childern(7, "Sanu");
		childern c3 = new childern(8, "Janu");
		
		TreeSet<childern> t = new TreeSet();
		
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(new childern(4, "janu"));
		t.add(new childern(8, "sanu")); // if we sort based on age it wont get execute bcoz already 8 is existing(duplicate)
		
		
		System.out.println(t);
		System.out.println("Child name "+" age");
		for(childern c: t)
		{
			System.out.println(c);
		}
	}
}
