package pkg;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshotprgm {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	
	@Before
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	
	public void test1() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    org.openqa.selenium.io.FileHandler.copy(src, new File("D://Facebook.png"));
		
	}

}
