package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sscz {
	
	ChromeDriver driver;
	String baseurl="https://sscz.ae/";
	
	@Before
	public void setValue()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//li[@id='menu-item-2241']")).click();
	}

}
