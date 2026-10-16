package PracticeGroups;

import org.testng.annotations.Test;

public class Payment {

	
	@Test(priority=1, groups= {"sanity", "regression","functional"})
	public void gpay()
	{
		System.out.println("Payment by Gpay");
	}
	
	@Test(priority=2, groups= {"sanity", "regression","functional"})
	public void phpay()
	{
		System.out.println("Payment by Phonepay");
	}
}
