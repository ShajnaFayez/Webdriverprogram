package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin {
	
	ChromeDriver driver;
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Parameters({"Username","Password"})
	@Test
	
	public void test1(String Username,String Password)
	{
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("Pass")).sendKeys("Password");
		driver.findElement(By.name("login")).click();
	}

}
