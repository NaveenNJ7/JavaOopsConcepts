package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class collectiontocollection {

	// Read datatype of traverse , traverse variable, Class names, arguments, generic, datatype 
	public static void main(String[] args) {
		
		ArrayList x = new ArrayList();
		x.add(10);
		System.out.println(x);
		
		//Adding one collection into another collection
		
		LinkedList y = new LinkedList(x);
		y.add(20);
		System.out.println(y);
		
		Vector z = new Vector(y);
		z.add(30);
		System.out.println(z);
		
		for(Object m: z)
		{
			System.out.println(m);
		}
		
		System.out.println("----------------------");
		
		ArrayList<Integer> a = new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);          
		a.add(40);
		
		for(int c: a) // if we add generic we can give data type traverse is generic name otherwise simply write Object 
		{
			System.out.println(c);
		}
		
		System.out.println("------------------");
		
		String[] Fruits = {"Apple","Banana","Mango"};
		
		for(String Fruit: Fruits)
		{
			System.out.println(Fruit);
		}
		

	}
}
