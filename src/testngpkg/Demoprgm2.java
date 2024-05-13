package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoprgm2 {
@BeforeMethod(alwaysRun = true)
	
	public void setUp()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod(alwaysRun = true)
	
	public void urlmethod()
	{
		System.out.println("Before Method");
	}
	
	@Test(groups= {"smoke" ,"sanity"})
	
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test(groups = {"sanity"})
	
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test(groups = {"smoke"})
	
	public void test3()
	{
		System.out.println("Test 3");
	}
	
	@AfterMethod
	
	public void aftermethod()
	{
		System.out.println("After Method");
	}
	
	@AfterTest
	
	public void aftertest()
	{
		System.out.println("After Test");
	}

}
