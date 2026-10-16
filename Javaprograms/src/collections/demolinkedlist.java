package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class demolinkedlist {

	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(30);
		a.add(40);
		a.add(50);
		
		System.out.println("Objects in a : "+a);
		
		System.out.println("------------");
		
		l.add(20);
		l.add(70);
		l.add(60);
		l.add(80);
		
		System.out.println("Objects in l : "+l);
		
		System.out.println("------------");
		
		l.addAll(a);
		
		System.out.println("object of a stored in l : "+l);
		
		Collections.sort(l);
		
		System.out.println("Natural sort order is ascending : "+l);
		
		System.out.println("------------");
		
		System.out.println(l.containsAll(a));
		
		System.out.println("------------");
		
		l.removeAll(a);
		
		System.out.println(l);
		
		System.out.println(l.containsAll(a));
		
		System.out.println("------------");
		
		System.out.println(l);
		
		l.set(1, 7); // 
		
		System.out.println(l);
		
		System.out.println("------------");
		
		l.add(1, 8);
		
		System.out.println(l);
		
		
		
		
	}
}
