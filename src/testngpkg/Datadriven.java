package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {

	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void test() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\toshiba\\Desktop\\userpass.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Sheet1");
		 int rowcount=sh.getLastRowNum();
		 for(int i=1;i<=rowcount;i++)
		 {
			 String username=sh.getRow(i).getCell(0).getStringCellValue();
			 String password=sh.getRow(i).getCell(1).getStringCellValue();
			 System.out.println("Username="+username);
			 System.out.println("Password="+password);
			 driver.get("https://www.facebook.com/");
			 driver.findElement(By.name("email")).sendKeys(username);
			 driver.findElement(By.name("pass")).sendKeys(password);
			 driver.findElement(By.name("login")).click();
			 
		 }
	}
}
