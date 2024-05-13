package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createpage {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[2]/a")
	WebElement createpage;
	
	public Createpage(WebDriver driver) {


		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public void pageclick()
	{
		createpage.click();
	}
	
	public String title()
	{
		return driver.getTitle();
	}
	

}
