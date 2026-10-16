package collections;

import java.util.TreeSet;

public class TestCarsort {

	public static void main(String[] args) {
		
		Car c1 = new Car(300);
		Car c2 = new Car(200);
		Car c3 = new Car(400);
		Car c4 = new Car(100);
		
		TreeSet<Car> t = new TreeSet(); // it allows only car objects
		
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		
		System.out.println(t);
		
	    for(Car c: t)
	    {
	    	System.out.println(c);
	    }
		
	}
}
