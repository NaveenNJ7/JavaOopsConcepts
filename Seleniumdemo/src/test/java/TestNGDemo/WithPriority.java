package TestNGDemo;

import org.testng.annotations.Test;

public class WithPriority {

	/*
	 Giver priority if we want to maintain order
	 priority number if it is consecutive(3,4,5) okay or may not be consecutive(10,16,19),we can give any number we want.
	 
	 according to method order first logout, Login and Openapp should execute but after giving priority it will change 
	 according to priority number
	 */
	
	@Test(priority=8)
	void LogOut()
	{
		System.out.println("Log out of the app");
	}
	
	@Test(priority=5)
	void Login()
	{
		System.out.println("Log in to the app");
	}
	
	@Test(priority=2)
	void Openapp()
	{
		System.out.println("Open the app");
	}
	
}
