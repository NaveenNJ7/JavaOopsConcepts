package ExetentReportDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class myListener implements ITestListener{

	public ExtentSparkReporter SparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
	    SparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//ExtentMyReport//myreport.html");
        SparkReporter.config().setDocumentTitle("Automation Report");
        SparkReporter.config().setReportName("Functional Testing");
        SparkReporter.config().setTheme(Theme.DARK); //standard also we can write here for white background
        
        extent = new ExtentReports();
        extent.attachReporter(SparkReporter);
        
        extent.setSystemInfo("ComputerName", "LocalHost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("OS", "Windows");
        extent.setSystemInfo("TesterName", "GoodWill");
        extent.setSystemInfo("BrowserName", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result) {
	    test = extent.createTest(result.getName());
	    test.log(Status.PASS, "Test case is Passed :"+result.getName());
	  }
	
	public void onTestFailure(ITestResult result) {
	    test = extent.createTest(result.getName());
	    test.log(Status.FAIL,"Test case is Failed :"+result.getName());
	    test.log(Status.FAIL, "Test case is failed because :"+result.getThrowable());
	    }
	
	 public void onTestSkipped(ITestResult result) {
		   test = extent.createTest(result.getName());
		   test.log(Status.SKIP, "Test case is skipped :"+result.getName());
		  }
	 
	 public void onFinish(ITestContext context) {
		    extent.flush();
		  }
	
	
	
	
	
	
}
