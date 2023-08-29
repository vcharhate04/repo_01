package test.aa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {

	WebDriver driver;
	@FindBy (xpath="//a[normalize-space()='Selenium Webdriver']")
	WebElement  seleniumaa;
	
	@FindBy(xpath="")WebDriver Driver;
	
	public PageClass(WebDriver driver) {
		
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	public void selectcource() {
		
		seleniumaa.click();
		
		
	}
}
