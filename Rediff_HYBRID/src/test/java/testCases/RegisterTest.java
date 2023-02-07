package testCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mycode.utilities.Utility;
import com.qa.mytutorial.Base.TestBase;

public class RegisterTest extends TestBase{
	
	public RegisterTest() throws Exception {
		super();
		
	}
	public WebDriver driver;
	
@BeforeMethod
	public void setup() {
		driver=initializeBrowser(prop.getProperty("url"));
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		
	}
@Test(priority = 1)
public void registerationwithAllMandatoryFields() {
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("input-firstname")).sendKeys("kkkz");
	driver.findElement(By.id("input-lastname")).sendKeys("aaaz");
	driver.findElement(By.id("input-email")).sendKeys(Utility.generateDateTimeStramp());
	driver.findElement(By.id("input-telephone")).sendKeys("65476787873");
	driver.findElement(By.id("input-password")).sendKeys("kkk123z");
	driver.findElement(By.id("input-confirm")).sendKeys("kkk123z");
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	String actualheading=driver.findElement(By.xpath("//div[@id='content']/child::p[1]")).getText();
	Assert.assertEquals(actualheading,"Congratulations! Your new account has been successfully created!");
}
@Test(priority = 2)
public void registerationwithAllFields() {
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("input-firstname")).sendKeys("kkkx");
	driver.findElement(By.id("input-lastname")).sendKeys("aaax");
	driver.findElement(By.id("input-email")).sendKeys(Utility.generateDateTimeStramp());
	driver.findElement(By.id("input-telephone")).sendKeys("6534657872");
	driver.findElement(By.id("input-password")).sendKeys("kkk123x");
	driver.findElement(By.id("input-confirm")).sendKeys("kkk123x");
	driver.findElement(By.xpath("//input[@name='newsletter'and@value='1']")).click();
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	String actualheading2=driver.findElement(By.xpath("//div[@id='content']/child::p[1]")).getText();
	Assert.assertEquals(actualheading2,"Congratulations! Your new account has been successfully created!");
	//Assert.assertTrue(driver.findElement(By.linkText("Your Account Has Been Created!")).isDisplayed(),"the account is not created");
}
@Test(priority = 3)
public void verifyRegistrationWithoutFillingAnyDetails() {
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("input-firstname")).sendKeys("");
	driver.findElement(By.id("input-lastname")).sendKeys("");
	driver.findElement(By.id("input-email")).sendKeys("");
	driver.findElement(By.id("input-telephone")).sendKeys("");
	driver.findElement(By.id("input-password")).sendKeys("");
	driver.findElement(By.id("input-confirm")).sendKeys("");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	//Assert.assertTrue(driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed(),"the warning is not displayed");
}
@AfterMethod
public void teardown() {
	driver.quit();
}


}
