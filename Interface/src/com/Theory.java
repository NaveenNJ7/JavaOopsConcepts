package com;

public class Theory {

	
	
	/*
	 
	 Interface - 
	     1) Interface is java type definition which can be declared using interface keyword
	     2) Interface is a media between two system, one system is user/client and another is
	        object with resources   
	     3) interface can have variables, but automatically they behave as 
	        public, static and final
	     4) interface can have methods, automatically they behave as public and abstract
	     5) class can inherit interface with the help of implements keyword
	     6) while inheriting interface, concrete class must override abstract methods or 
	        class must declare with abstract
	     7) while overriding methods access specifiers should be same type or higher visibility
	     
	     Class inherits interface - keyword  - implements
	     interface inherits interface - kw - extends
	     class to inherits class  -  kw - extends
	     interface can not inherits class
	     
	     
	    Note - 
	    << >> - these are angular braces - stereotypes - indicates interface
	          - arrow mark indicates - extends
	          - break arrow mark indicates  - implements
	          - c indicates class
	          
	                  
	    Important note - 
	      
	        1) Class can not inherit multiple classes (can not extends multiple classes), 
	           only one class can extends
	        2) class can inherit multiple interfaces
	        3) while class inheriting both interface and concrete class, first it should 
	           extend concrete and implements interfaces
	        4) Interfaces does not contain constructors
	        5) therefore we can not create object of interface
	                       
	                   
	       consider 
	       interface A has method
	       void m1();
	       and 
	       interface B has method
	       void m1();
	       
	       Class C 
	       it implements both interfaces
	       but here both interfaces have same method name and not arguments
	       at this time in Class C we should override methods only one time because interface A will assume
	       its his methods and interface B will assume its his method, so we need to override only once.
	       suppose if we override both in class c
	       public void m1()
	       {
	       
	       }
	       
	       public void m1()
	       {
	       
	       }
	       we need to write both methods, so here method overloading rule will go wrong.thats why
	       we should override it only once
	       
	       suppose any of one interface having one arguments means we should override both methods            
	                   
	                   
	               
	               
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
