package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	
WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void hangler()
	{
		driver.get("https://demo.guru99.com/popup.php");
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println("Parent Window Title" + driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>  allwindowhandles=driver.getWindowHandles();
		
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("shajnafayez433@gmail.com");
				driver.close();
			}
			
			driver.switchTo().window(parentwindow);
		}
		
	}

}
