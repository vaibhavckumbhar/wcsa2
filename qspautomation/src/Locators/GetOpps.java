package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebDriver.chromeDriver;

public class GetOpps {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("pune");
			 
			 
		}
}
	
	
