package collections;

import java.util.ArrayList;
public class democollections {

	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(10);         // Here Array list accepted duplicate values, null, 
		l.add(25.03);      // and different type of data (Heterogeneuos)
		l.add(10);
		l.add("Easy");
		l.add(10);
		l.add(null);
		
		/* here if we print it will return the objects in collection instead of fullyqualified class
		   because it overridden toString() method  */
		
		System.out.println(l); 
		
		System.out.println("---------------");
		
		// which give length of the collection
		System.out.println(l.size());
		
		System.out.println("---------------");
		
		// which index position of the object
		System.out.println(l.get(3));
		System.out.println("---------------");
		
		// which gives whether the collection have that entered object or not
		System.out.println(l.contains(null));
		System.out.println(l.contains("easy"));
		System.out.println(l.contains("Easy"));
		
		System.out.println("---------------");
		
		// which remove the object from the collection
		System.out.println(l.remove(25.03));
		System.out.println(l);
		
		System.out.println("---------------");
		
		System.out.println(l.add(25.03));
		System.out.println(l);
		
		System.out.println("---------------");
		
		// which check whether the collection is empty or not
		System.out.println(l.isEmpty());
		System.out.println("---------------");
		
		// which gives the index position of the object
		System.out.println(l.indexOf("Easy"));
		
		// suppose if there is no easy word or 100th index position then it gives -1 as the result
		System.out.println(l.indexOf("easy"));
		
		System.out.println("---------------");
		
		// which gives the last index position of the duplicate object
		
		System.out.println(l.lastIndexOf(10));
		System.out.println("---------------");
		
		System.out.println(l);
		// which remove the all objects from the collection
		  l.clear();
		  
		  System.out.println(l.isEmpty());
		  System.out.println("Cleared method removes all objects");
	}

	
	}

