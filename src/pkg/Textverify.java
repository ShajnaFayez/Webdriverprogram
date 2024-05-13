package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textverify {

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
		
		String buttontext=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
				if(buttontext.equals("Check availability"))
				{
					System.out.println("PASS");
				}
				else
				{
					System.out.println("FAIL");
				}
	
		
	}
}
