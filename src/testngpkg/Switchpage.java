package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Switchpage {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\toshiba\\Desktop\\switch.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		 for(int i=1;i<=rowcount;i++)
		 {
		
		   String email=sh.getRow(i).getCell(0).getStringCellValue();
		   driver.get("https://demo.guru99.com/popup.php");
		   driver.findElement(By.xpath("/html/body/p/a")).click();
		   driver.findElement(By.name("emailid")).sendKeys(email);
		   driver.findElement(By.name("btnLogin")).click();
		   
		 }
		   
		
	}

}
