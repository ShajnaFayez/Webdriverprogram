package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgms {
	
	ChromeDriver driver;
	String baseurl="file:///C:/Users/toshiba/Desktop/prgms.html";
	@Before
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	
	public void setValues()
	{
		//driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ABC");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("DE");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
