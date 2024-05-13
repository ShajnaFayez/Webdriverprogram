package pkg;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprgm {
	
	ChromeDriver driver;
	String baseurl="http://www.google.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	
	public void titleverification()
	{
		String exp="Google";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@Test
	public void contentVerification()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Text is Present");
		}
		else
		{
			System.out.println("Text is not Present");
		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

	
}
