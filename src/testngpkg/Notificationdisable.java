package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Notificationdisable {
	
	WebDriver driver;
	
	@BeforeTest
	public void befretest()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Disable Notifications");
		driver=new ChromeDriver(options);
		
	}
	
	@Test
	public void test()
	{
		driver.get("http://www.justdial.com/");
	}

}
