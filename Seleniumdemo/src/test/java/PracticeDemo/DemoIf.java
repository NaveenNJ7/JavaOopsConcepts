package PracticeDemo;

import org.testng.annotations.Test;

public class DemoIf {

	@Test
	public void verify()
	{
		String exp = "Java";
		String act = "java";
		
		if(act.equals(exp))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
