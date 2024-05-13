package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parametrisation {
	
	@Parameters({"tool"})
	@Test
	 public void test1(String tool)
	 {
		System.out.println("values is"+tool);
	 }

}
