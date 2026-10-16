package AssertionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JustIf {

	@Test
	void testTitle()
	{
		String exp = "Open";
		String act = "Close";
		
		if(exp.equals(act))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}
	
	/*
	 Condition will fail but in result or report it will show test method got passed
	 but we want to show test method also should show pass or fail so we should use Assertion
	 we can also use assertion with if condition or separate assertion can also use
	 */
}
