package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprgm {
	
	ChromeDriver driver;
	String baseurl="http://www.facebook.com";
	
	@Before
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	
	public void setValues()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcd.123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
