package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {

	// find below methods in ITestListener(press control and hover on ITestListener)
	public void onStart(ITestContext context) {
	    
		System.out.println("Execution starts");
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test Start");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test passed");
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test failed");
	  }
	
	public void onTestSkipped(ITestResult result) {
           System.out.println("Test Skipped");
	  }
	
	
	
	
	
}
