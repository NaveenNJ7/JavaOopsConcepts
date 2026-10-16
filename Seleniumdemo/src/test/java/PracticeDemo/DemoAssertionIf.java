package PracticeDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertionIf {

	@Test
	public void verify()
	{
		String act = "Anbu";
		String exp = "Shivu";
		
		if(act.equals(exp))
		{
			System.out.println("Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Failed");
			Assert.assertTrue(false);
		}
	}
}
