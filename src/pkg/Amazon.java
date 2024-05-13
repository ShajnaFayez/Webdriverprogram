package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	ChromeDriver driver;
	String baseurl="http://amazon.in";
	
	@Before
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	
	public void setValues()
	{
		WebElement search=driver.findElement(By.name("field-keywords"));
		
		search.sendKeys("Mobiles");
		search.submit();
		//driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		
		//driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		//driver.findElement(By.xpath("//div[@id='nav-main']/div/a")).click();
		
		//driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
		//driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/div")).click();
		driver.findElement(By.xpath("//div[@id='nav-main']/div")).click();
	}
	

}
