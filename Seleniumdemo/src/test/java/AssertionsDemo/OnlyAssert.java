package AssertionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlyAssert {

	@Test
	void testTitle()
	{
		String exp = "Open";
		String act = "Ope"; // check for another parameter not matched
		
		Assert.assertEquals(exp, act);
	}
}
