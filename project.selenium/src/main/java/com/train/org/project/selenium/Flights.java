package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flights {
	public static WebDriver Driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		Driver.get("https://www.expedia.com/Flights");
		Thread.sleep(6000);
		Driver.manage().window().maximize();
		
		Thread.sleep(6000);
		Driver.findElement(By.id("d1-btn")).click();
		Thread.sleep(6000);
		Driver.findElement(By.xpath("//*[@aria-label='oct  6, 2022']")).click();
		
		
		
		
	}

}
