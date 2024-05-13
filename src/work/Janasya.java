package work;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Janasya {
	
	ChromeDriver driver;
	String baseurl="https://www.janasya.us/collections/kurta-sets";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	

	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")).click();
	}
	
	@Test
	
	public void test2()
	{
		boolean logocheck=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--22163962724639__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[2]/div/div/div/a/img")).isDisplayed();
		if(logocheck)
		{
			System.out.println("Logo is Present");
		}
		else
		{
			System.out.println("Logo is not Present");
		}
	}
	
	
	@Test
	 public void test4()
	 {
		
	 }
	
	
	@Test
	
	public void test5()
	{
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
	}
	
	@Test
	
	public void test3() 
	{
		WebElement items=driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/toolbar-item/div[2]/div[3]/div[1]/label"));
		List<WebElement> li=driver.findElements(By.xpath("//*[@id=\"CollectionProductGrid\"]/toolbar-item/div[2]/div[3]/div[1]/div/div/span[1]"));
		
	}
	
	@Test
	
	public void test6()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total no of Links:"+li.size());
		
		
	}
	

}
