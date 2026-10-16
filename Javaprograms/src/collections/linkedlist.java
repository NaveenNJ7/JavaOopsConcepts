package collections;


import java.util.Collections;
import java.util.LinkedList;
public class linkedlist {

	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add(50);
		l.add(40);
		l.add(20);
		l.add(30);
		
		System.out.println("Object in l : "+l);
		
		System.out.println("--------------");
		
		for(int i = 0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		
		System.out.println("-----------");
		
		Collections.sort(l);
		
		System.out.println("After sorting objects in l");
		
		for(int i = 0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
	}
}
