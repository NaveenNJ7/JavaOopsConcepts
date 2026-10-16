package TestNGDemo;

import org.testng.annotations.Test;

public class PriorityExample {

	/*
	 if we dont give mention any priority number to method, by default it will take Zero(0)
	 */
	
	@Test(priority=75)
	void Logout()
	{
		System.out.println("Log out");
	}
	
	@Test               // not giving priority, by default it will take 0
	void Openapp()
	{
		System.out.println("Open app");
	}
	
	@Test(priority=10)
	void Login()
	{
		System.out.println("Log in");
	}
}
