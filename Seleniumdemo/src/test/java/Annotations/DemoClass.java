package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoClass {

	/*
	 Test case
	 login
	 search
	 Advance search
	 logout
	 */
	
	@Test(priority=2)
	void Advancesearch()
	{
		System.out.println("Advance search");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search");
	}
	
	@AfterClass
	void Logout()
	{
		System.out.println("Log out");
	}
	
	@BeforeClass
	void Login()
	{
		System.out.println("Log in ");
	}
}
