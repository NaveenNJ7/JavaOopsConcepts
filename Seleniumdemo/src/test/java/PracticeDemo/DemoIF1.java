package PracticeDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoIF1 {

	@Test
	public void verify()
	{
		String act = "Anbu";
		String exp = "Mammu";
		
		if(act==exp)
		{
			System.out.println("Pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Fail");
		    Assert.assertTrue(false);
		}
	}
}
