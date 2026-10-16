package day3;

public class increment_decrement {

	public static void main(String args[])
	{
		
		//increment case 1
		
		int a = 10;
		
		//suppose if we want to increase the value by one normally we do 
		
		a=a+1; //here we get value of a 11
		
		System.out.println(a);
		
		System.out.println("-----------");
		
		System.out.println("or");
		
		a = 10;
		a++;
		
		System.out.println(a);
		
		System.out.println("-------------");
		
		
		// case-2 post increment 
		
		a = 10;
		
		int r = a++; 
		
		System.out.println(r);
		
		/* here first a value will assign to variable r and increment will happen 
		 if we print value r we will get value 10
		 if we print value a then we get value 11  
		 */
		
		System.out.println(a);
		
		System.out.println("--------------");
		
		
		// case-3 pre increment
		
		a = 10;
		
		r = ++a;
		
		System.out.println(r);
		
		/* here r value will increment first and a value will assign later
		 if we print value r we will get 11
		 if we print value a we will get 11
		 */
		
		System.out.println(a);
		
		System.out.println("---------------");
		
		
		// Decrement ------------CASE 1
		// normally we do 
		a = 20;
		
		a = a-1; // result will be 19
		
		System.out.println(a);
		
		// with using --
		
		a = 20;
		
		a--;
		
		System.out.println(a);
		
		System.out.println("----------------");
		
		// assigning to another variable
		
		a = 20;
		
		int m = a--;
		
		System.out.println(m); // 20
		
		System.out.println(a); //19
	  
		
	    System.out.println("----------------");
	    
	    a = 20;
	    
	    int n = --a; // 19
	    
	    System.out.println(n);
	    
	    System.out.println(a); // 19
	    
	    System.out.println("-----------------");
	    
	    
	    
	    // Assignment operation
	    
	    /* suppose if you want to increase value by
	       more than one, then we can use assignment operators
	     */
	    
	    a = 20;
	    
	    a = a+20;
	    
	    System.out.println(a);
	    
	    System.out.println("or");
	    
	    a = 20;
	    a+=20;
	    
	    System.out.println(a);
	    
	    System.out.println("-----------");
	    a = 30;
	    
	    a-= 10;
	    
	    System.out.println(a);
	    
	    System.out.println("-----------");
	    
	    a = 100;
	    
	    a/=5;
	    
	    System.out.println(a);
	    
	    System.out.println("------------"); //-----------');
	    
	    a = 100;
	    
	    a%=5;
	    
	    System.out.println(a);
	    
	    
	    System.out.println("-----------------");
	    
	    
	    // Ternary operators 
	    
	    /* Statement for ternary operators 
	       Variable = Expression?result1:result2 */
	    
	    int w = 20;
	    
	    int u = 30;
	    
	    int v = w>u?20:30; //false ( answer:30)
	    
	    System.out.println(v);
	    
	    int t = w>u?30:20; //false (answer:20)
	    
	    System.out.println(t);
	    
	    
	    System.out.println("-------------------");
	    
	   int photo_size = 1055*1055;	 
	     
	     int pixel = 1024*1024;
	     
	    String Naveen = (1055*1055>1024*1024)?"accept":"reject";
	    
	    System.out.println(Naveen);
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	
		
	}
}
