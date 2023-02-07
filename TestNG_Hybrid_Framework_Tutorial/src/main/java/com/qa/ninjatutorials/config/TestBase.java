package com.qa.ninjatutorials.config;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.ninjatutorial.utilities.Utilities;

public class TestBase {
	
	public static WebDriver driver;//this is a must
	public static Properties prop;
	 
	public void loadPropertiesFile() throws Exception {
		prop=new Properties();
		FileInputStream ip =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\ninjatutorials\\config\\config.properties");
	     prop.load(ip);
	}
	
	   //you can use this constructor instead of a method to access the properties file
	   public TestBase() throws Exception{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\ninjatutorials\\config\\config.properties");
	    prop.load(ip);	
	   }
	
	public WebDriver initializeBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGELOAD_TIME));
		driver.get(prop.getProperty("url"));
		
		return driver;
	}

}
