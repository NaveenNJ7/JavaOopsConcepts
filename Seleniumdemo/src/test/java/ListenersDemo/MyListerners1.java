package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

@Listeners(ListenersDemo.MyListerners1.class)
public class MyListerners1 implements ITestListener {

	public void onStart(ITestContext context) {
	    System.out.println("Execution start");
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test Start");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test passed");
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test fails");
	  }
	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("Test skipped");
	  }
	
	
	
	
}
