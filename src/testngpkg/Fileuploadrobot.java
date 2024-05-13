package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {
	
	ChromeDriver driver;
	String baseurl="https://www.ilovepdf.com/word_to_pdf";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test() throws AWTException
	{
		driver.get(baseurl);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a/span")).click();
		
		fileupload("D:\\Resume.DOCX");
	}
	
	public void fileupload(String path) throws AWTException
	{
		StringSelection strselection=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		
		
		Robot robot=new Robot();
		
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	


}
