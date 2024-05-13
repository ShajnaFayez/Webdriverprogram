package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	
	ChromeDriver driver;
	String baseurl="http://www.google.com";
	
	@Before
	    
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	
	public void setValues()
	{
		//driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		//or
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Books");
		search.submit();
		
	}

}
