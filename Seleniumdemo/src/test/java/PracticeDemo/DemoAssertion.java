package PracticeDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion {

	@Test
	public void Verify()
	{
		String act = "Nav";
		String exp = "Nave";
		
		Assert.assertEquals(act, exp);
	}
}
