package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logodisplay {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void test1()
	{
		boolean logocheck=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
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
