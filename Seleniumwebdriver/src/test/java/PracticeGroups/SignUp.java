package PracticeGroups;

import org.testng.annotations.Test;

public class SignUp {

	@Test(priority=1, groups= {"regression"})
	public void byFacebook()
	{
		System.out.println("Sign up by facebook");
	}
	
	
	@Test(priority=2, groups= {"regression"})
	public void byInstagram()
	{
		System.out.println("Sign up by Instagram");
	}
	
	@Test(priority=3, groups= {"regression"})
	public void byTwitter()
	{
		System.out.println("Sign up by Twitter");
	}
	
	
}
