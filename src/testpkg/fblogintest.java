package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class fblogintest {
	
	WebDriver driver;
	 @BeforeTest
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 String baseurl="http://www.facebook.com";
		 driver.get(baseurl);
		 
	 }
	 
	 @Test
	 public void logintest()
	 {
		 Fbloginpage ob=new Fbloginpage(driver);
		 ob.setValues("shajnaum433@gmail.com", "shajna1243");
		 ob.loginclick();
		 
		 
	 }

}
