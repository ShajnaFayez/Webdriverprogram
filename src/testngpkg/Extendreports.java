package testngpkg;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendreports {
	
	WebDriver driver;
	String baseurl="https://www.facebook.com/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	
	@BeforeTest
	public void beforetest()
	{
		reporter=new ExtentHtmlReporter("C:\\Users\\toshiba\\Desktop\\Selenium\\Reports/firstreport.html");
		reporter.config().setDocumentTitle("AutomationReportOfFB");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Hostname", "Localhost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Testername", "Shajna");
		extent.setSystemInfo("Browser Name", "Chrome");
		driver=new ChromeDriver();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("fbtitleverification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
	}
	
	@Test
	public void buttonverification()
	{
		test=extent.createTest("buttonverification");
		String exp1="Log In";
		String actual1=driver.getTitle();
		Assert.assertEquals(exp1, actual1);
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void browserclose(ITestResult result)throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test Case Failed is"+result.getName());
			test .log(Status.FAIL, "Test Case Failed is"+result.getThrowable());
			String screenshotpath=screenshotMeMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
			
		}
		
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test Case Skipped is"+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is"+result.getName());
		}
	}
	
	public static String screenshotMeMethod(WebDriver driver,String screenshotname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="C:\\Users\\toshiba\\Desktop\\Selenium\\Screenshot/"+screenshotname+".jpeg";
		org.openqa.selenium.io.FileHandler.copy(src,new File(destination));
		
		return destination;
		
	}

}
