package Family;

public class Test {

	
	public static void main(String[] args) {
		
		// upcasting
		/*
		 Son s = new Son();
		 Father f = s;
		 */
		
          Father f  = new Son();
          //superclass reference can access only superclass variables
          System.out.println("Father name :"+f.fname);
		  System.out.println("------------");
		  
		  // downcasting
		  Son s = (Son) f;
		  
		  System.out.println("Father name :"+s.fname+" and Son name :"+s.sname);
		
		
		
		
		
		
	}
}
