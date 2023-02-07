package tutoringsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffXpaths {
	
public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rediff.com");
driver.findElement(By.xpath("//a[@class='signin']")).click();
driver.findElement		
		
	}

}
