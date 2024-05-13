package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	
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
		driver.findElement(By.id("email")).sendKeys("abcd34@gamil.com");
		driver.findElement(By.name("pass")).sendKeys("abcd2134");
		driver.findElement(By.name("login")).click();
	}
	
	

}
