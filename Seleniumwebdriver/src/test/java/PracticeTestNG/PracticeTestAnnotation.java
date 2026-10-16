package PracticeTestNG;

import org.testng.annotations.Test;

public class PracticeTestAnnotation {

	/*
	 Here order of the execution is based on methods Alphabetics
	 not on what we written
	 */
/*	@Test
	public void openapp()
	{
		System.out.println("Opened app");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logged out");
	}
	
	@Test
	public void login()
	{
		System.out.println("Logged in");
	}
	     */
   //_ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _
	
	
	/*
	  Priority, order of execution will happen according to Numbers
	  numbers can be random, or consecutive
	  it may be negative also
	  Default priority is zero,  
	*/
	// according to priority it will execute
 /*	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logged out");
	}
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("Logged in");
	}
	
	@Test(priority=1)
	public void openapp()
	{
		System.out.println("Openapp");
	}  */
	
	 //_ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _
	
	// according to random numbers and negative number
	
 /*	@Test(priority=0)
	public  void login()
	{
		System.out.println("log in");
	}
	
	@Test(priority=5)
	public void openapp()
	{
		System.out.println("Open app");
	}
	
	@Test(priority=-5)
	public void logout()
	{
		System.out.println("log out");
	} */
	
	
	 //_ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _
	// accoding to default value(zero)
	
 /*	@Test
	public void openapp()
	{
		System.out.println("open app");
	}
	
	@Test(priority=2)
	public void logout()
	{
		System.out.println("log out 6");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("login 9");
	}  */
	
	 //_ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _
	// if two methods having same priority then according to alphabets it will execute
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("Log in at 9");
	}
	
	@Test(priority=2)
	public void logout()
	{
		System.out.println("Log out at 6");
	}
	
	@Test(priority=1)
	public void openapp()
	{
		System.out.println("open app");
	}
	
	
	
}
