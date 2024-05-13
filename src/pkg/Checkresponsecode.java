package pkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkresponsecode {
	
	ChromeDriver driver;
	String link="https://www.facebook.com/";
	
	@Before
	
	public void setValues() {
		driver=new ChromeDriver();
		driver.get(link);
	}
	
	@Test
	
	public void test1() throws IOException
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of Links---"+li.size());
		for(WebElement we:li)
		{
			String link=we.getAttribute("href");
			verify(link);
			
		}
	}

	private void verify(String link) throws IOException {
		try {
			
		
	        URL ob=new URL(link);
	        HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	        if(con.getResponseCode()==200)
	        {
	        	System.out.println("Successfull Responsecode is 200"+link);
	        }
	        else if(con.getResponseCode()==404)
	        {
	        	System.out.println("Broken link responsecode is 404"+link);
	        }
	        
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid ");
		}
		
		
	}

}
