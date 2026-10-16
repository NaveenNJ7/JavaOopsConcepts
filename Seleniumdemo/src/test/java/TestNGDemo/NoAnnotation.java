package TestNGDemo;

import org.testng.annotations.Test;

public class NoAnnotation {

	// TestNG will execute methods which are having @Test annotation
	// it will not execute method which does not have @Test annotation
	@Test(priority=2)
	void Login()
	{
		System.out.println("Log in");
	}
	
	@Test(priority=-2)
	void Openapp()
	{
		System.out.println("Open app");
	}
	//not having annotation, it will not execute
	void Logout()
	{
		System.out.println("Logout");
	}
}
