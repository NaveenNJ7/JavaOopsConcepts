package com;

public class Theory {

	/*
	 
	 String  - 
	   1) String is pre defined public final class present in java.lang package
	   2) String objects immutable in nature ( can not modify )
	   3) String is collection or set of characters
	   4) String is also a non primitive data type (default value is null)
	   5) String implements Serializable, Comparable, charSequence
	   
	   String objects stored inside a memory location called as String pool
	   - String pool further divided into 2 types
	   1) Constant pool 
	   2) non constant pool
	   
	   Literal objects stored inside constant pool and constant pool does not allow duplicate value
	   String s1 = "Java"; 
	   
	   String objects created using new operator are stored inside non constant pool and 
	   non constant pool duplicates values allowed
	   String s1 = new String("Java");
	   
	   
	   String class automatically overridden the 3 methods from object class bcoz it inherirs object class
	   1) toString()
	   2) hashCode()
	   3) equals()
	   
	   1) toString() of the object class overridden in the String class to return the actual data 
	      passed to the constructor during the object creation
	      
	   2) hashCode() of the object calss overridden in the String class to return the number based on 
	      the ASCII value
	      
	   3) equals() of the object class overridden in the String class to compare the contents of the both objects   
	 
	 
	 Note - 
	 
	 1) is String class inheriting the Object class? - Yes
	 2) Has it overridden any methods of object class? - Yes
	 
	 Constructors present in the String class
	 1) Empty representation of a String object
	 2) Passing some set of characters
	 3) Converting char[] into String object
	 
	 
	 How String objects are immutable
	 when we re-initialize a String object, rather than modifying the same object, a new object is created
	 and reference pointing to the old object gets de referenced (looses its connection wtih old object) 
	 and start pointing to the newly created object
	 
	 String s = "java";
	 String s1 = "java";
	 String s = "Mava"; 
	 
	 s it looses its connection with "java" and starts pointing to the newly created object "Mava".
	 but s1 still have connection with "java"
	 
	 
	 Mutable version of String
	 1) StringBuffer
	 2) StringBuilder
	 
	 Methods present in String
	 important methods
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
}
