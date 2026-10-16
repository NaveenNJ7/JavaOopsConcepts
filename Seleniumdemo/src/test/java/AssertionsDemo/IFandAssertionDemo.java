package AssertionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IFandAssertionDemo {

	@Test
	void testTitle()
	{
		String exp = "Open";
		String act = "Open"; // check for close also, give wrong value
		
		if(exp.equals(act))
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
