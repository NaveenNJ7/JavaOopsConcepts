package day15_06_10;

public class Global_and_Local {

	
	/* Variables - are containers to store data
	   
	   2 types - Global variables and local variables
	   
	   1) Global variables - if variables declared within class limit or scope are called global
	   
	      * These variables can be access through out the class ( thats y it called as global variable)
	       
	       Static and non static variables
	       
	       
	       Class Student
	       {
	          static int age;
	          
	          String name = "Navin";
	        
	       }
	       
	   2) Local variables - if variables declared within specific scope or limit are called as local 
	      
	      * These variables can access within the specified limit like methods, blocks, constructors
	      
	      
	      Class Student
	      {
	            int age; ----------------- global variable 
	            
	            
	      void m(int a, int b)   -------- int a and int b are local variables 
	      
	      {
	        s.o.p("value of a:"+a+" value of b: "+b)
	      }
	 
	      static(int c)          -----------int c is local variable
	      {
	       s.o.p("print"+c)
	      }
	      
	     
	      
	      
	      
	      Note :
	      1) When we have Global and local variables name same, always local variables will dominate
	      
	      2) In order to avoid dominating part or access Global variable we make use of keyword "this"
	      
	      3) This keyword "this" pointing towards current object or instance
	      
	 
	       examples
	       
	       Class Student{
	       
	       int age = 21;
	       
	       void method (int age)
	       {
	          int age = 20;
	         s.o.p(age);
	         
	         s.o.p(this.height);
	         
	       }
	       
	       pulic static void main(String[] args)
	       {
	         Student s = new Student();
	         
	         s.method();
	         
	       }     
	 
	         here if we print result will be age = 20 // local variable
	         
	         suppose if we want to print global variable we need to make use of keyword this
	 */
}
