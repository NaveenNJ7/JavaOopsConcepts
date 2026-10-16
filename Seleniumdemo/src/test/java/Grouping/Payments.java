package Grouping;

import org.testng.annotations.Test;

public class Payments {

	@Test(priority=2, groups= {"sanity","regression","functional"})
	void paymentsinDollars()
	{
		System.out.println("payments in Dollars");
	}
	
	@Test(priority=1, groups={"sanity","regression","functional"})
	void paymentsinRupees()
	{
		System.out.println("payments in Rupees");
	}
	
}
