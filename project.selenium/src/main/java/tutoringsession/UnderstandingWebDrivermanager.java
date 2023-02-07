package tutoringsession;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnderstandingWebDrivermanager {
	
public static WebDriver Driver;
	


 public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriverManager.firefoxdriver().setup();




 }

}
