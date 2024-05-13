package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	
	@Before
	 public void setUp()
	 {
		driver=new ChromeDriver();
		driver.get(baseurl);
	 }
	
	@Test
	public void test1()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total no of Links: "+li.size());
	}

}
