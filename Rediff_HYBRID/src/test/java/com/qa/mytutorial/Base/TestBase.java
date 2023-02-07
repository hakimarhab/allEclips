package com.qa.mytutorial.Base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.mycode.utilities.Utility;

public class TestBase {
 public WebDriver driver;
 public static Properties prop;
 
 public void loadpropertiesFile() throws Exception  {
	// create object of property of the class
	  prop= new Properties();
	  FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\tutorial\\config\\configuration.properties.file");
      prop.load(ip);
 
 }
 // WE CAN ALSO create a constructor to load properties file
 public TestBase() throws Exception {
	 prop= new Properties();
	  FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\tutorial\\config\\configuration.properties.file");
     prop.load(ip);
	 
 }
 public WebDriver initializeBrowser(String BrowseName) {
	 
	 if (BrowseName.equalsIgnoreCase("chrome")) {
		 
		 driver = new ChromeDriver();
			
	 }else if (BrowseName.equalsIgnoreCase("firefox")) {
		 driver=new  FirefoxDriver();
		 
	 }else if (BrowseName.equalsIgnoreCase("edge")) {
		 driver=new EdgeDriver();
	 } 
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.PAGELOAD_TIME));
		//
		driver.get(prop.getProperty("url"));
		 return driver;
	 }
 }

