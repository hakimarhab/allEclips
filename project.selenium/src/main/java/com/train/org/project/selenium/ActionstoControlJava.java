package com.train.org.project.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionstoControlJava {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\azoua\\eclipse-workspace\\project.selenium\\drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.com");

// driver 
	}

}
