package collections;

import java.util.LinkedHashSet;

public class linkedhashset {

	
	public static void main(String[] args) {
		
		LinkedHashSet h = new LinkedHashSet();
		
		// here it will allow insertion order but no duplicate values.
		
		h.add(10);
		h.add(20);
		h.add("Hashcode");
		h.add(10); 
		h.add(20.05);
		
		System.out.println(h);
		
		System.out.println("--------");
		
		for(Object obj: h)
		{
			System.out.println(obj);
		}
	}
}
