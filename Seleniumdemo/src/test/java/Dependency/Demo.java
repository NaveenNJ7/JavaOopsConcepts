package Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	/*
	 login depends on openapp, if open app becomes failed, then login will not execute 
	 and search depends on login, search also will not execute and advance search also depends 
	 on search, so it will also not execute. please read noted if u need clarification
	 */
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4, dependsOnMethods= {"search"})
	void advancesearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5)
	void logout()
	{
		Assert.assertTrue(true);
	}
	
}
