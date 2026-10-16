package day15_06_10;

public class Contructors {

	
	/*  1) These are set of instructions used when initialization(assigning) and instantiation (object creation)
	     
	    2) Constructions get executed during object creation
	    
	    3) They will never have return type
	    
	    4) Class name and constructor name should be always same
	    
	    5) Syntax - Access specifier Class name(Arguments)   ------- arguments - optional 
	    
	    6) Two types
	       1 - Default constructors
	       2 - Custom constructors
	       
	    7) Non parameterized custom constructors 
	       non parameterized = without arguments (not accepting any parameters or arguments)
	       parameterized = accept parameters
	      
	       Custom - if a constructor explicitly defined inside class by user ( used developed constructor )
	       
	       Default constructor 
	       when we not define any constructor inside the class automatically complier generate constructor
	       
	       if a constructor explicitly not present in the class compiler will generate constructor
	       
	       
	       it looks like    
	                                                            default class (virtually present)
	       class Bike {                                       |   
	                                                          | Bike()
	                  public static void main(String[] args){ | {
	                                                          |
	                   Bike b = new Bike();                   | }
	                                                          |   ( default constructor neither accept arguments
	                  }                                       |      and nor implementations )
	       }                                                  |
	       
	       
	    Note : when there is default constructor present, there will not be present custom constructor
	           and vice versa
	    
	 
	*/
	
	
	
}