package comparator;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		
		
		HashMap h = new HashMap();
		
		h.put(10, "Raju");
		h.put("Talikote", 25);
		h.put(20, 20);  
		h.put(20,15);
		h.put("ABC", 25);
		h.put('a', 14);
		h.put(7, "Ho");
		
		System.out.println("Insertion oreder not maintained\n and duplicate key not allowed\n BUT duplicate value allow");
		System.out.println(h);
		
		// 1.used to get value of specified key
		System.out.println(h.get(10));
		System.out.println(h.get(100)); // there is no 100 so its null
		
		//2.used to check key is present or not
		System.out.println(h.containsKey("Talikote"));
		System.out.println(h.containsKey("Ho")); // Ho is a value not key -- its false
		
		// 3.used to check value is present or not
		System.out.println(h.containsValue("Ho"));
		System.out.println(h.containsValue(7)); // 7 is key -- false
		
		// 4.used to check collection is empty or not
		System.out.println(h.isEmpty());
		
		// 5.remove used to remove value based on key specified
		System.out.println(h);
		h.remove(10);
		System.out.println(h);
		
		// 6.clear used to remove all the objects from the collection
		h.clear(); 
		
		System.out.println(h.isEmpty());
		
	}
}
