package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createpage;

public class Createtest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		Createpage cp=new Createpage(driver);
		cp.pageclick();
		String actualtitle=cp.title();
		Assert.assertEquals(actualtitle, "Facebook");
		System.out.println("Title is "+actualtitle);
		
	}

}
