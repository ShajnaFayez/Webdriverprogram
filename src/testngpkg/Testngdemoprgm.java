package testngpkg;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Testngdemoprgm {
	
	@BeforeMethod()
	
	public void setUp()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod()
	
	public void urlmethod()
	{
		System.out.println("Before Method");
	}
	
	@Test(priority = 3,enabled = false)
	
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test(priority = 2,invocationCount = 4)
	
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test(priority = 1,dependsOnMethods = "test2")
	
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
