package TestNGConversion;

import org.testng.annotations.Test;

public class Democonversion {

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
