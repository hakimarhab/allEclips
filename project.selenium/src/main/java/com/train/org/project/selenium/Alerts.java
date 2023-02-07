package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {


		// TODO Auto-generated method stub
		
		public static WebDriver Driver;
			


		 public static void main(String[] args) throws InterruptedException  {

		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		Driver.get("https://demoqa.com");
		
		Thread.sleep(6000);
		Driver.manage().window().maximize();
	      
			
		
		Driver.findElement(By.id("alert button")).click();
		Driver.switchTo().alert().accept();
		Driver.findElement(By.id("confirmButton")).click();
		Driver.switchTo().alert().dismiss();
		Driver.findElement(By.id("promptButton")).click();
		
		
		
		
		
;	}

}
