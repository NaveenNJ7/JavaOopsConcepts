package day12_Overloading;


import java.util.Scanner;
public class Overloading1 {

	
	/* Scanner : it is used to accept input from the user and it is predefined class in java
	 Rules to accept input from the user
	 
	 1) create object using Scanner class 
	 2) Pass System.in to the constructor call
	    syntax : Scanner obj reference name = new Scanner(System.in);
	 3) import Class Scanner
	    syntax : import java.util.Scanner;
	 4) make use of the predefined methods [nextInt()] to accept dynamic input
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of z");
		
		int z = sc.nextInt();
		

		System.out.println("Enter value of y");
		
		int y = sc.nextInt();
		
	    if(z>y)
	    {
	    	System.out.println(z+" is greater than "+y);
	    }
	    else if(z==y)
	    {
	    	System.out.println(z+" is equal to "+y);
	    }
	    else
	    {
	    	System.out.println(z+" is less than "+y);
	    }
	    
	    sc.close();
	}
}

/* exmple : syntax for create obj and pass System.in
            1) Scanner scan = new Scanner(System.in)
            
            syantax for import Class scanner 
            import java.util.Scanner;
            
            syntax for predefined method
           datatype and variable= scan.nextInt();
           
           once we done with accepting intputs we need to close the scan
           syntax is
           scan.close();
           */