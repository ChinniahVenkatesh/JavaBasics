package Frameword_practice.test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class TestBase {

	@Parameters({"browser"})
	@BeforeSuite
	public void beforeSuite(String browser)
	{
		System.out.println(browser);
		System.out.println("Before Test Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	
}
