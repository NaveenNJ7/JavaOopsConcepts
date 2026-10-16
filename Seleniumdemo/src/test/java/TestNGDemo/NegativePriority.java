package TestNGDemo;

import org.testng.annotations.Test;

public class NegativePriority {

	// also give negative priority, from lowest number it will execute
	// -5,-4,-3,-2,-1, 0,1,2,3,4,5
	
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
