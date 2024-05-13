package work;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class Janasyasite {
	
	ChromeDriver driver;
	String baseurl="https://www.janasya.us/collections/kurta-sets";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test(priority = 1)
	public void screenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://JanasyaSite"));
	}
	
	@Test(priority = 2)
	public void newarrival()
	{
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")).click();
	}
	
	@Test(priority = 3)
	public void logo()
	{
		boolean logocheck=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--22163962724639__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[2]/div/div/div/a/img")).isDisplayed();
		if(logocheck)
		{
			System.out.println("Logo is Present");
		}
		else
		{
			System.out.println("Logo is not present");
		}
	}
	
	@Test(priority = 5)
	public void drop()
	{
		driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/toolbar-item/div[2]/div[3]/div[1]/div/div/")).click();
		List<WebElement>li =driver.findElements(By.xpath("//*[@id=\"CollectionProductGrid\"]/toolbar-item/div[2]/div[3]/div[1]/div/ul/li"));
		for(WebElement we:li)
		{
			String text=we.getText();
			if(text.equals("15"))
			{
				we.click();
			}
		}
		
	}
	
	@Test(priority =6 )
	public void category()
	{
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a")).click();
		
		
	}
	
	@Test(priority = 4)
	public void links()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		for(WebElement we:li)
		{
			String link=we.getAttribute("href");
			String linktext=we.getText();
			System.out.println(link+"---Text-----"+linktext);
		}
	}
	
	//@Test(priority = 7)
	//public void menus()
	//{
		
	//}
	
	
	

}
