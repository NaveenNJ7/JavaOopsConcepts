package PracticeDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHard1 {

	@Test
	public void verify()
	{
		System.out.println("Passed 1");
		
		Assert.assertTrue(false);
		
		System.out.println("Passed 2");
	}
}
