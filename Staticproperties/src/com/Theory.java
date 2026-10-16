package com;

public class Theory {

	/*
	   Static - 
	        1) it is a key word which can be used with variable, method, class and blocks
	        2) while executing programs the class loader loads all static properties into a 
	           memory location called class area or static pool
	        3) Static properties can be accessed with the help of class name
	        4) Static properties can be accessed directly or with help of class name in the same class
	           if we call properties without class name, internally it consider as
	           Class name.variable or methods
	           Study.age or age
	           Study.display() or display()
	        5) Static properties can be accessed only with the help of class name in different
	            class or another class
	   
	           syntax - Class name.variable()  
	                    Class name.method()
	        6) Static belongs to the Class not the object
	           for non static we need to create object to access the non static properties
	           for satic - with the help of Class name
	   
	    Note - 
	        1) Static properties are loaded only once therefore they will have a single copy
	        
	        2) all the objects are implicitly pointing towards to static pool, therefore we can access 
	           static properties with object reference but it is not good practice
	           
	        3) Static properties belongs to class, so we can access it with Class name
	           non static belongs to object so we should create object and access
	        
	        4) what if Class itself declared as a Static, Class directly cant be a static, 
	           only public, abstract and final are permitted.
	           but if we have nested Class, we can create static Class, one Class present 
	           inside another Class
	          
	           Class A{
	                   static Class B{
	                                 }
	                  }       

    
             5) static one copy and non static multiple copies where do we use actually.
                whenever there is a requirement for single copy that is static 
                 and multiple copies - not static
                 
                in a college (students) - college name will be same but id will be different 
                 so college name should be static and id will be not static.
             
     */



}
