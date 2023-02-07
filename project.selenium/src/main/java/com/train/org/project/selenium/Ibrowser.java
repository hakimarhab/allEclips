package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ibrowser{ 
	
static WebDriver driver;	

    public static void main( String[] args ) throws InterruptedException {
    
    	//Auto generated method stub
       
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\azoua\\eclipse-workspace\\project.selenium\\drivers\\chromedriver.exe");
    driver= new ChromeDriver();
    driver.get("https:www.facebook.com");
    // refresh browser
    Thread.sleep(6000);
    driver.navigate().refresh();
    //window maximize
    driver.manage().window().maximize();
    //Backward
    driver.navigate().back();
    //forward
    Thread.sleep(6000);
    driver.navigate().forward();
    // get window handle which is a specific identifier number for each page
    String windows=driver.getWindowHandle();
    System.out.println(" the window handle is: "+windows);
    //get current URL
    String URL=driver.getCurrentUrl();
    System.out.println(" the URL is: "+URL);
    //get the title of the web page( here it is GOOGLE)
    String titles=driver.getTitle();
    System.out.println(" the title is: "+titles);
    //Selenium Testing
    // by ID
    //WebElement UserField=driver.findElement(By.id("email"));
   // UserField.sendKeys("peopletech");
    //By name
   // WebElement PasswordField=driver.findElement(By.name("pass"));
   // PasswordField.sendKeys("it");
   // WebElement LogButton=driver.findElement(By.name("login"));
   // LogButton.click();
    // by linktext
  //  WebElement Forgotit=driver.findElement(By.linkText("Forgot password"));
    //Forgotit.click();
 
   // Partial linktext
    //WebElement Forgotit1=driver.findElement(By.partialLinkText("Forgot password"));
    //Forgotit1.click();/*
    
    // creat account is a link
   
    WebElement CreatAnAccount=driver.findElement(By.linkText("Create new account"));
    CreatAnAccount.click();
 
    // enter first_name
    Thread.sleep(6000);
   WebElement Firstname=driver.findElement(By.name("firstname"));
  Firstname .sendKeys("Azouaou");
  
  // enter last name
  WebElement Lastname=driver.findElement(By.name("lastname"));
  Lastname .sendKeys("dahmoune");
  
  //enter email@
  WebElement Email=driver.findElement(By.name("reg_email__"));
   Email.sendKeys("azda@gmail.com");
  // reenter email
   WebElement Emailconfirm=driver.findElement(By.name("reg_email_confirmation__"));
   Emailconfirm.sendKeys("azda@gmail.com");
  
  // enter password
   
   WebElement Password=driver.findElement(By.name("reg_passwd__"));
   Password.sendKeys("abcdef");
   
    //enter the month _birthday
    WebElement Month=driver.findElement(By.name("birthday_month"));
    Select ob=new Select(Month);
    ob.selectByIndex(5);
    
    // enter the day birthday
    
    WebElement Day=driver.findElement(By.name("birthday_day"));
    Select obd=new Select(Day);
    obd.selectByIndex(21);
   
    // enter Year
    
    WebElement Year=driver.findElement(By.name("birthday_year"));
    Select oby=new Select(Year);
    oby.selectByVisibleText("1985");
    
    // gender Absolute xpath
    
    WebElement Gend=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]"));
    Gend.click();
   // Relative xpath
   WebElement signup=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
   signup.click();
    //   hoove over
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}

	
	}

