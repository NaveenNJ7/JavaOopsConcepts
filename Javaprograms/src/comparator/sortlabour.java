package comparator;

import java.util.Scanner;
import java.util.TreeSet;

public class sortlabour {

	
	public static void main(String[] args) {
		
		SortLabourBySalary salary = new SortLabourBySalary();
		SortLabourByName name = new SortLabourByName();
		
		
		
		TreeSet<Labour> t = new TreeSet(name);
		
		t.add(new Labour("Mestri", 45.55));
		t.add(new Labour("Gandu alu", 45.65));
		t.add(new Labour("Hennu alu", 45.45));
		
		
		for(Labour l: t)
		{
			System.out.println(l);
		}
	}
}
