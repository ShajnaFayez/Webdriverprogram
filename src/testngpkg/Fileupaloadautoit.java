package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupaloadautoit {
	
	ChromeDriver driver;
	String baseurl="https://www.ilovepdf.com/word_to_pdf";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test() throws Exception
	{
		driver.get(baseurl);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a/span")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Autoit\\Upload.exe");
		Thread.sleep(3000);
	}

}
