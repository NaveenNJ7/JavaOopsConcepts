package com;

public class Theory {

	/* 
	  Method overloading - in a class having multiple methods of same name, but 
	  difference in the arguments is called MO.
	  
	  To achieve Method overloading we need to satisfy either of the following rules
	  1) There should be change in the number of arguments
	  2) There should be change in the data type of the arguments
	  3) There should be change in the order/sequence of the arguments
	  
	  1) m(int a)    m(int a, int b)
	  2) m(int a)    m(int a, String s)
	  3) m(int a String b) m(String b int a)
	  
	  note - 1) m(int a) m(int b)
	         This is invalid because no of arguments, there is no change in DT, order is also same
	         whether variables name is might same or might not same it does not matter, 
	         only matters is Data type
	         
	         2) We can overload both static and not static methods
	            static void m(){
	            }
	         3) we can overload main()[main method] also, but execution will starts 
	         	from main() which accepts String[] as arguments.
	            wherever method contains the String[] as arguments, this is where in the execution starts, 
	            check examples
	            
	            public static void main(String[] args){
	            
	            }
	            
	            public static void main(int a){
	            
	            }
	            
	            public static void main(double b){
	            
	            }
	            
	            here execution will starts where the String[] as the arguments, remaining 
	            methods will execute only if we call it
	          
	         4) return type might same or different, it does not matter
	         
	         5) Method overloading is also referred as compile time polymorphism
	 */
}
