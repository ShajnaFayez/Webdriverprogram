package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titlecheck {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String actualtitle=driver.getTitle();
		
		
		String exp="Google";
		if(actualtitle.equals(exp))
		{
			System.out.println("Title Comarison Pass");
		}
		else
		{
			System.out.println("Title Comaparison Fail");
		}

	}

}
