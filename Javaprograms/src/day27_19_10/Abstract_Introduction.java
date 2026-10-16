package day27_19_10;

public class Abstract_Introduction {

	
	/*
	 
	 Abstract : 
	 		  
	 		  1) It is predefined keyword
	 		  
	 		  2) It can be used with respective class and method
	 		  
	 		  3) If a class declared with abstract keyword then it is called as abstract class
	 		  
	 		  4) Abstract class can accept both concrete and abstract methods
	 		  
	 		  5) Syntax : Access specifier abstract return type method name();
	 		  
	 		  6) Abstract specifier have only method declaration
	 		  
	 Concrete :
	 		  
	 		  1) If a class not declared with abstract then it is called as concrete class
	 		  
	 		  2) It will accept only concrete methods
	 		  
	 		  3) Concrete methods have both declaration and definition or implementation.
	 		  
	 Note     :		  
	 		  
	 		  *  Contract of abstract or what should we do when a class extends abstract class
	 		  
	 		  1) When a class inherits an abstract class, override all the abstract methods.
	 		  
	 		  2) When a class inherits an abstract class, if we do not want to override 
	 		  	 the inherited abstract method, then make the sub class as abstract class.
	 		  	 
	 Note     :
	 
	 		  1) Can a class inherit an abstract class - Yes 
	 		  
	 		  2) We cannot create an object of abstract class
	 		  
	 		  	 Example - 
	 		  	 		    abstract void write(); // here there is no implementation or definition
	 		  	  		    Note n = new Note();
	 		  	  		    n.write();
	 		  	 
	 		     Because - When we call method what will the output or implementation, there is no output at all, 
	 		      		   here method is unimplemented so thats the reason abstract class is incomplete class.
	 		      		   
	 		      		   * so we can create object for concrete class and not for abstract class.
	 		     
	 		  3) Abstract class cannot be Private 
	 		  4) Abstract class cannot be Static
	 		  5) Abstract class cannot be final
	 		  
	 		     Because : * If we have abstract class and abstract method, the main intention of having abstract 
	 		     		     method is to override later.
	 		     		     
	 		     		   * If we make it as private, this method can access only within the class cannot access
	 		     		     outside the class (cannot be inherited)
	 		     		     
	 		     		   * we cannot be overridden if we make it final method
	 		     		   
	 		     		   * Cannot be static, if we do we can not override and inherit 
	 		     		   
	 		     		   * So if we make method as static, private, and final indirectly we are restricting for
	 		     		     override and inherit
	 		     		   
	 		  6) Suppose if we have constructor - for to execute constructor we need to create an object.
	 		     
	 		     * Can abstract class have constructor? - Yes
	 		       Because - super calling statement, one constructor can call or invoke another constructor that way
	 		         		 we can do it.
	 		         		 
	 		         		 We cannot invoke indirectly, it has to be invoked by the subclass constructor either 
	 		         		 implicitly or explicitly using super();
	 		         		 
	 		     * Super calling statement :
	 		       when we create an object of an class, if that class has a super class and if that super class has a
	 		       non parameterized constructor (not accepting any parameter), the sub class constructor use 
	 		       super calling statement implicitly.
	 		       
	 		     * If we have parameterized constructor, when we create an object of a class, if that class having 
	 		       super class and if that super class has a parameterized constructor (accepting parameter),
	 		       the subclass constructor invoke it explicitly  [ super(); // keyword ]
	 		         		 
	 */
}
