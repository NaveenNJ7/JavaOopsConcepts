package TestNGDemo;

import org.testng.annotations.Test;

public class SamePriority {

	//methods having same priority value they execute based on the alphabetical order
	@Test(priority=5)
	void Openapp() {
		System.out.println("Open app");
	}
	
	@Test(priority=8)
	void Logout()
	{
		System.out.println("Log out");
	}
	
	@Test(priority=8)
	void Login()
	{
		System.out.println("Login");
	}
}
