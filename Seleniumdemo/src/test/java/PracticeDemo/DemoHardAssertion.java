package PracticeDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssertion {

	@Test
	public void verify()
	{
		System.out.println("Passed 1");
		
		Assert.assertTrue(true); // execute all statements
		
		System.out.println("Passed 2");
	}
	
	@Test
	public void verify1()
	{
		System.out.println("Passed 3");
		Assert.assertTrue(false);       // execute all statements before assertion
		System.out.println("Passed 4");
	}
}
