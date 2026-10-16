package collections;

import java.util.ArrayList;

public class generics {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		int a = 10;
		int b = 20;
		
		l.add(a);
		l.add(b);
		l.add(15);
		
		System.out.println("Object in l : "+l);
		
		System.out.println("----------");
		
		ArrayList<Double> l1 = new ArrayList<Double>();
		
		double c = 10.1;
		double d = 10.2;
		double e = 10.3;
		
		l1.add(c);
		l1.add(d);
		l1.add(e);
		
		System.out.println("Objects in l1 : "+l1);
		
		ArrayList m = new ArrayList();
		
		int f = 10;
		double g = 20.26;
		char h = 'V';
		
		m.add(f);
		m.add(g);
		m.add(h);
		
		for(Object o: m)
		{
			System.out.println(o); // we get result in traverse
		}
		
		for(Object o: m)
		{
			System.out.println(m); // we get objects present in array
		}
		
		
	}
}
