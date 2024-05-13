package study;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlecheckjunit {
	
	ChromeDriver driver;
	String baseurl="http://www.google.com";
	
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		String expectedtitle="Google";
		String actualtitle=driver.getTitle();
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title pass");
		}
		else
		{
			System.out.println("Title fail");
		}
	}

}
