package testCases;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.qa.mycode.utilities.Utility;
import com.qa.mytutorial.Base.TestBase;

public class LoginTest extends TestBase{
	public LoginTest() throws Exception {
		super();
		
	}
	public WebDriver driver;
  @BeforeMethod
   public void setUp() {
	    driver=initializeBrowser("chrome");
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
  }
	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {


		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		// String LoginAssert=driver.findElement(By.xpath("//a[contains (text(),'Edit
		// your account information')]")).getText();
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains (text(),'Edit your account information')]")).isDisplayed(),"the link Edit your account information does not exist  ");
       
	}
	@Test(priority = 2)
	public void verifyLoginWithInValidCredentials() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("input-email")).sendKeys(Utility.generateDateTimeStramp());
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed(),"the link Warning no match for E_mail Adress and /or Password");
	   
	}
    @Test(priority = 3)
    public void verifyLoginWithInvalidEmailidValidPassword() {
    	
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("input-email")).sendKeys(Utility.generateDateTimeStramp());
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed(),"the link Warning no match for E_mail Adress and /or Password");
	    
    }
    @Test(priority = 4)
    public void verifyLoginWithValidEmailidInValidPassword() {
    	
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123445566");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed(),"the link Warning no match for E_mail Adress and /or Password");
	    
    }
    @Test(priority = 5)
    public void verifyLoginWithNoCredentials() {
    	
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed(),"the link Warning no match for E_mail Adress and /or Password");
	    
    	
    }
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
    public String GenerateDateTimeStramp() {
    	
    	Date date=new Date();
    	return date.toString().replace(":", "_").replace(" ", "_");
    	
    	
    	
    	
    	
    }
}
