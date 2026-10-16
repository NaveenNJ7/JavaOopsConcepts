package collections;

import java.util.TreeSet;

public class SortLabour {

	
	public static void main(String[] args) {
		
		Labours l1 = new Labours("ABC", 44, 44.44);
		Labours l2 = new Labours("MNO", 11, 44.22);
		Labours l3 = new Labours("PQR", 33, 44.33);
		
		TreeSet<Labours> l = new TreeSet();
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(new Labours("XYZ", 22, 44.44));
		l.add(new Labours("GHI", 55, 44.55));
		
		System.out.println("Labour Name "+"  id  "+"  Salary");
		for(Labours w : l)
		{
			System.out.println(w);
		}
		
		System.out.println("salary will sort based on non decimal value\nwe can observe that decimal values are different");
		System.out.println("but it will consider only non decimal values, here non decimals are duplicated");
	}
}
