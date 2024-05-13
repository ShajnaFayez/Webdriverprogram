package work;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Amazonswitch {
	
	ChromeDriver driver;
	String baseurl="https://www.amazon.in/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test(priority = 1)
	public void search()
	{
		WebElement search=driver.findElement(By.name("field-keywords"));
		search.sendKeys("Mobile Phones");
		search.submit();
		
	}
	
	@Test(priority = 2)
	public void titlecheck()
	{
		String actualtitle=driver.getTitle();
		String exp="Amazon.in Mobile Phones" ;
		
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("Same Title");
		}
		
		else
		{
			System.out.println("Different Title");
		}
		
	}
	
	
	
	@Test(priority = 3)
	public void addcart()
	{
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		
		Set<String> allwindowhandles=driver.getWindowHandles();
		
		for(String handles:allwindowhandles)
		{
			if(!handles.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handles);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
				//String cartwindow=driver.getWindowHandle();
				driver.findElement(By.xpath("/html//html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/inputbody/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();
				//driver.switchTo().window(cartwindow);
				driver.close();
			}
			driver.switchTo().window(parentwindow);
			
			
		}
	}

}










