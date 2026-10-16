package day24_16_10;

public class Up_down_casting_introduction {
	
	/* 
	 
	 Upcasting : 
	    
	             1) Creating an object of subclass and storing its address into a reference of type superclass
	             
	             2) With upcasted reference we can access only superclass members or properties
	             
	             3) Is-A relation is mandatory to achieve upcasting
	             
	             4) Upcasting done implicitly or automatically
	             
	             5) superclass reference and subclass object
	             
	             
	                father
	                int age= 20;                     upcasting 						Downcasting 
	                   ^ 														|
	                  /|\                            father f = new son();		|   Son s = (son) f;
	                   |  extends                           or					|
	                   |                             son s = new son();			|
	                   |                             father f = s;   			|     
	                son 
	                String name = "vinnu";
	    
	    
	    Downcasting : 
	    
	     		 1) It is a process of converting upcasted reference back to subclass type reference.
	     		 
	     		 2) With subclass or downcasted reference we can access both super class and sub class properties
	     		 
	     		 3) In order to achieve downcasting, upcasting is mandatory
	     		 
	     		 4) downcasting has to be done explicitly
	     		 
	     		 
	    Note   : 
	    
	    		 1) Creating an object of subclass and storing it into reference of super class that is called as upcasting
	    
	    		 2) Major advantage of upcasting is Generalization meaning into a single reference type i can pass different 
	    		    different types of objects here.
	    		    
	 */

}
