package study;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titlecheck {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title pass");
		}
		else
		{
			System.out.println("Title fail");
		}

	}

}
