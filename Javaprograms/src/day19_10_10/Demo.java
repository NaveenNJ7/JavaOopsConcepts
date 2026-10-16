package day19_10_10;

public class Demo {

	
	public static void main(String[] args) {
		
		// declaration 
		
		int[] a;
		
		// creation
		
		a = new int[3];
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("here int default value is zero");
		
		
		System.out.println("------------------------------");
		
		// declaration and creation
		
		int[] b = new int[4];
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
	    
	System.out.println("---------------------------------");	
		// initialization
		
		a[0] = 10;
		a[1] = 20;
	    a[2] = 30;
	    
	    System.out.println(a[2]);
	    
	    System.out.println("-----------------------------");
	    b[0] = 30;
	    b[1] = 40;
	    b[2] = 50;
	    b[3] = 60;
	    
	    System.out.println(b[2]);
	    
	    System.out.println("-----------------------------");
	    
	    // array initialization directly
	    
	    String[] name = {"Naveen", "Madhuri","Swathi"};
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		System.out.println("-----------------------------");
		int i =0;
		for(i=0; i<name.length; i++) {
			
			System.out.println(name[i]);
		}
		
		
	
	}
}
