package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.AllTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowncount {
	
	ChromeDriver driver;
	String link="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	
	public void setValue()
	{
		driver=new ChromeDriver();
		driver.get(link);
	}
  @Test
   public void setvalues() {

	Select day=new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
    day.selectByValue("07");
    List<WebElement> list=day.getOptions();
    int daycount =list.size();
    System.out.println("days count is----"+daycount);

    Select month=new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
    month.selectByVisibleText("JAN");
    List<WebElement> list1=month.getOptions();
    int monthcount =list1.size();
    System.out.println(" months count is----"+monthcount);
    Select Year=new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")));
    Year.selectByValue("1994");
    List<WebElement> list2=day.getOptions();
    int yearcount =list2.size();
    System.out.println(" years count is----"+yearcount);

	}

}
