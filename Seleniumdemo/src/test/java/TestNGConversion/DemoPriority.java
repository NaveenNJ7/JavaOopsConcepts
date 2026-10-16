package TestNGConversion;

import org.testng.annotations.Test;

public class DemoPriority {

	@Test(priority=3)
	void Logout()
	{
		System.out.println("Logout");
	}
	
	@Test(priority=0)
	void Login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=-5)
	void Openapp()
	{
		System.out.println("Open app");
	}
}
