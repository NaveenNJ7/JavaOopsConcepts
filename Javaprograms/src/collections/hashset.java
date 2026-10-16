package collections;

import java.util.HashSet;

public class hashset {

	
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		
		/* 1) we cant add duplicate values, 
		   2) insertion oreder is not mantaining, 
		   3) null can add,
		   4) it is not index base.
		 
		 */
		h.add(10);
		h.add(20);
		h.add(null);
		h.add("surya");  // we dont get return in proper insertion order. 
		
		System.out.println(h);
		
		System.out.println(h.size());
		
		System.out.println("-------------");
		
		for(Object o: h)
		{
			System.out.println(o);
		}
	}
}
