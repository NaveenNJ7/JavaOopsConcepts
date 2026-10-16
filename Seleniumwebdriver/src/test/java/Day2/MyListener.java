package Day2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListener implements ITestListener{

	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
	
		sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\techreport.html");
		sparkreporter.config().setDocumentTitle("Automation");
		sparkreporter.config().setReportName("Functional testing");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		
		extent.setSystemInfo("Computer name", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester", "Naveen");
		extent.setSystemInfo("os", "Windows");
		extent.setSystemInfo("browser", "chrome");
		
	  }
	
	public void onTestSuccess(ITestResult result) {
	    test = extent.createTest(result.getName());
	    test.log(Status.PASS, "Test case is passed"+result.getName());
	  }
	
	public void onTestFailure(ITestResult result) {
	    test =extent.createTest(result.getName());
	    test.log(Status.FAIL, "Test case is failed"+result.getName());
	    test.log(Status.FAIL , "Test case is failed cause"+result.getName());
	  }
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case is skipped"+result.getName());
	    
	  }
	
	public void onFinish(ITestContext context) {
	    extent.flush();
	  }
}
