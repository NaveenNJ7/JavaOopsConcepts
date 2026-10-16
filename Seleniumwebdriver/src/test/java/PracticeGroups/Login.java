package PracticeGroups;

import org.testng.annotations.Test;

public class Login {

	@Test(priority=1, groups= {"sanity"})
    public void byFacebook()
    {
    	System.out.println("Login by Facebook");
    }
	
	@Test(priority=2, groups= {"sanity"})
	public void byInstagram()
	{
		System.out.println("Login by Instagram");
	}
	
	@Test(priority=3, groups= {"sanity"})
	public void byTwitter()
	{
		System.out.println("Login by Twitter");
	}
}
