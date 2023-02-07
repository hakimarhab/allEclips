package com.train.org.project.selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edgedriver {
static WebDriver driver;

//ScreenShots();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		    driver.get("https://www.facebook.com");
		
		public static void ScreenShots() {

		File HomeStPage=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(HomeStPage, new File("C:\\Users\\azoua\\eclipse-workspace\\project.selenium\\src\\Pictures\\Home.jpg"));
		}
		
	}

}
