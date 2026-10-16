package Superkeyword;

public class Son extends Father {

	int age=20;
	
	void family()
	{
		int age=10;
		System.out.println("Local variable :"+age);       // local variable
		System.out.println("Global variable :"+this.age); // global variable
		System.out.println("Super variable :"+super.age); // super class variable
	}
}

/* when variables having same name in super class and sub class, super is key word 
 used to access properties from super class
 */

