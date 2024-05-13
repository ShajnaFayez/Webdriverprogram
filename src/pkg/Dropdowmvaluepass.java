package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowmvaluepass {
	
	ChromeDriver driver;
	String link="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	
	public void setValue()
	{
		driver=new ChromeDriver();
		driver.get(link);
	}
	
	@Test
	
	public void test1()
	{
		WebElement daydetails=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(daydetails);
		day.selectByValue("03");
		
		WebElement monthdetails=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(monthdetails);
		month.selectByVisibleText("MAR");
		
		WebElement yeardetails=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select(yeardetails);
		year.selectByValue("2023");
		
		
		
	}
	
	

}
