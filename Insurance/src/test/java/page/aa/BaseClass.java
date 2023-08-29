package page.aa;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import test.aa.PageClass;
import utilitypack.ReadDataMethod;

public class BaseClass {

	WebDriver driver;
	PageClass lp;
	@BeforeSuite
	public void initBrowser() throws IOException
	{
//		
		
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(ReadDataMethod.getPropData("testsiteurl"));
	}
	
	@BeforeClass
	public void createObject()
	{
		lp = new PageClass(driver);
		
	
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

	
}
