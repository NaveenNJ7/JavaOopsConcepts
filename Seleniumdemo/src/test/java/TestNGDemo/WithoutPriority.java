package TestNGDemo;

import org.testng.annotations.Test;

public class WithoutPriority {

	//here there is no main method still we can execute using @Test annotation
	
	/*
	 according to method order first open app, login and logout should execute but here it wont maintain
	 execution order. after executing check the console
	 
	 if we want to maintain execution order we need to give priority value.
	 */
	
	@Test
	void openapp()
	{
		System.out.println("Open the app");
	}
	
	@Test
	void login()
	{
		System.out.println("Login to the app");
	}
	
	@Test
	void logout()
	{
		System.out.println("Log out");
	}
}
