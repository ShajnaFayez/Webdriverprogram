package work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demosite {
	
	ChromeDriver driver;
	String baseurl="https://demo.competethemes.com/";
	
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test(priority = 1)
	public void test()
	{
		WebElement search=driver.findElement(By.name("s"));
		search.sendKeys("Jeans");
		search.submit();
	}
	
	@Test(priority = 2)
	public void test2()
	{
String actualtitle=driver.getTitle();
		
		
		String exp="Demo Site";
		if(actualtitle.equals(exp))
		{
			System.out.println("Title Comarison Pass");
		}
		else
		{
			System.out.println("Title Comaparison Fail");
		}
	}
	
	@Test(priority = 3)
	public void test3()
	{
		
			boolean logocheck=driver.findElement(By.xpath("/	html/body/div[1]/div/header/div[2]/div[1]/div/a/img")).isDisplayed();
			if(logocheck)
			{
				System.out.println("Logo is Displayed");
			}
			else
			{
				System.out.println("Logo is not Displayed");
			}
	}

}
