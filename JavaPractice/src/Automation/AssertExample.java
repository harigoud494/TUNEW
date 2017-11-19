package Automation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssertExample {
	public static WebDriver driver;
	
	@Before
	public void start(){
		System.setProperty("webdriver.gecko.driver","C:/Users/AJ/Desktop/automation/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.tkmaxx.com/");
		Assert.assertEquals("Please enter a search query",driver.findElement(By.cssSelector("#formsolrsearch .js-searchMessage .js-validateError")).getText() );
	}
	
	@Test
	public void test1(){
		
	}
	@After
	public void close(){
		
	}

}
