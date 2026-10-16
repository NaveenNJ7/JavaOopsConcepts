package Grouping;

import org.testng.annotations.Test;

public class Signuppage {

	@Test(priority=1, groups= {"regression"})
	void signupbyemail()
	{
         System.out.println("Sign up by email");
	}
	
	@Test(priority=2, groups= {"regression"})
	void signupbyfacebook()
	{
         System.out.println("Sign up by facebook");
	}
	
	@Test(priority=3, groups= {"regression"})
	void signupbytwitter()
	{
         System.out.println("sign up by twitter");
	}
}
