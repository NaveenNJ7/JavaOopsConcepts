package day17_08_10;

public class this_super_constructor {

	
	/* Constructor chaining :one constructor calling another constructor when there is multiple constructors(we can
	 						 only when constructor overloading)
	 
	 there are two types we can call
	 
	 1) this calling statement ----  this() ---- using this calling statement we can call the constructor( or 
	 											 constructor chaining) in the same class.
	  											
	 
	 2) super calling statement---- super() ----- with super calling statement (and also using IS-A Relationship)
	  											  we can call the another constructor from another class.
	 										      
	 										      
	 Note : 1) when we have multiple constructor in class, we need to create multiple objects to call every constructor 
	 		(we call one constructor from one object) so in order avoid this we have this() calling statement.		
	 		
	 	    2) this() and super() should always be the first executable line within the constructor 
	 	       (constructor call must be the first statement in the constructor -- it means this()& super() must write in 1st line)
	 	       
	 	    3) Recursive chaining is not possible, if n constructors are there we can have maximum of (n -1) calling statement
	 	        Eg - if 10 constructors are there in class means we can create only 9 calling statements.
	    
	    
	 Note : 1) 
 	Super calling statement : Used to invoke or call constructor of another class
 	
 	             a) Is-A relationship - extends (keyword should use)
 	             b) super() - super calling statement should use
 	             
 	        Super can be used in 2 ways
 	        
 	       1) implicitly : When we create an object of a class, if that class has a super class and if that super class has a 
	 		               non parameterized constructor the sub class constructor will invoke the super call constructor
	 		               implicitly.( implicit super calling statement execute internally)
	 		   
	 	   2)Explicitly : When we create an object of a class, it that class has a super class and if that super class has a
	 	    	   		  parameterized constructor the sub class constructor should invoke the super call constructor 
	 	    	   		  explicitly, otherwise we get compile time error.
	 */
}
