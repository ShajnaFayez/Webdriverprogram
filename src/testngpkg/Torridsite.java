package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Torridsite {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("abcd34@gamil.com");
		driver.findElement(By.name("pass")).sendKeys("abcd2134");
		driver.findElement(By.name("login")).click();
		String link=driver.getCurrentUrl();
		System.out.println(link);
		
		String exp="https://www.facebook.com/";
		if(link.equals(exp))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	

}
